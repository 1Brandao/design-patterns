import java.util.Objects;

public class Order {
    private OrderState state = new PendingState();

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public String getStatus() {
        return state.getName();
    }

    // Used by concrete states; clients act through pay, ship, cancel and deliver.
    void changeState(OrderState state) {
        this.state = Objects.requireNonNull(state, "state");
    }
}
