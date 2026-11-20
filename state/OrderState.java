public interface OrderState {
    default void pay(Order order) {
        System.out.println("Payment not allowed");
    }

    default void ship(Order order) {
        System.out.println("Shipping not allowed");
    }

    default void cancel(Order order) {
        System.out.println("Cancellation not allowed");
    }

    default void deliver(Order order) {
        System.out.println("Delivery not allowed");
    }

    String getName();
}
