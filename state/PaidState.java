public class PaidState implements OrderState {
    @Override
    public void ship(Order order) {
        order.changeState(new ShippedState());
        System.out.println("Order shipped");
    }

    @Override
    public void cancel(Order order) {
        order.changeState(new CancelledState());
        System.out.println("Order cancelled");
    }

    @Override
    public String getName() {
        return "PAID";
    }
}
