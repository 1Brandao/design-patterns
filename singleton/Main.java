import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new UserService().connect();
        new ReportService().generate();

        // Different parts of the system reach the same object.
        AppConfig first = AppConfig.getInstance();
        AppConfig second = AppConfig.getInstance();

        System.out.println("Same instance? " + (first == second));

        System.out.println();

        // Additional challenge: several threads asking for the instance at once
        // must still end up with a single object.
        List<AppConfig> collected = Collections.synchronizedList(new ArrayList<>());
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(() -> collected.add(AppConfig.getInstance()));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        boolean allEqual = collected.stream().allMatch(config -> config == first);

        System.out.println("Threads that asked for the instance: " + collected.size());
        System.out.println("All of them got the same object? " + allEqual);
    }
}
