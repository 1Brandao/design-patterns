// Existing implementation, already compatible with the expected interface.
public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Payment approved: $" + amount);
    }
}
