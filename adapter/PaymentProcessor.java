// Target: the payment interface the system expects.
// OrderService depends only on this abstraction.
public interface PaymentProcessor {

    void pay(double amount);

}
