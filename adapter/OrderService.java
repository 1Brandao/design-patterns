// Client: works with the abstraction, so it does not know whether the payment
// is handled by the internal class or by the adapted external gateway.
public class OrderService {

    private final PaymentProcessor payment;

    public OrderService(PaymentProcessor payment) {
        this.payment = payment;
    }

    public void checkout(double amount) {
        payment.pay(amount);
    }
}
