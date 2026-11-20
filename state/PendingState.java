public class PendingState implements OrderState {
    @Override
    public void pay(Order order) {
        order.changeState(new PaidState());
        System.out.println("Payment confirmed");
    }

    @Override
    public void cancel(Order order) {
        order.changeState(new CancelledState());
        System.out.println("Order cancelled");
    }

    @Override
    public String getName() {
        return "PENDING";
    }
}
