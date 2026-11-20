public class Main {
    public static void main(String[] args) {
        System.out.println("Order 1: payment, shipping and delivery");
        Order fulfilled = new Order();
        run(fulfilled, fulfilled::ship);
        run(fulfilled, fulfilled::pay);
        run(fulfilled, fulfilled::deliver);
        run(fulfilled, fulfilled::ship);
        run(fulfilled, fulfilled::cancel);
        run(fulfilled, fulfilled::deliver);
        run(fulfilled, fulfilled::cancel);

        System.out.println("\nOrder 2: cancellation before payment");
        Order pending = new Order();
        run(pending, pending::cancel);
        run(pending, pending::pay);

        System.out.println("\nOrder 3: cancellation after payment");
        Order paid = new Order();
        run(paid, paid::pay);
        run(paid, paid::cancel);
    }

    private static void run(Order order, Runnable action) {
        action.run();
        System.out.println("Status: " + order.getStatus());
    }
}
