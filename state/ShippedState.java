public class ShippedState implements OrderState {
    @Override
    public void deliver(Order order) {
        order.changeState(new DeliveredState());
        System.out.println("Order delivered");
    }

    @Override
    public String getName() {
        return "SHIPPED";
    }
}
