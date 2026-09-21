// Client: reads the settings from the shared instance instead of building its own.
public class UserService {

    public void connect() {
        AppConfig config = AppConfig.getInstance();
        System.out.println("Connecting to " + config.getDatabaseUrl());
    }
}
