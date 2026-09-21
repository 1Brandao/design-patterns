// Adaptee: belongs to another team and must stay exactly as it is.
// Its method signature does not match what the system expects.
public class ExternalPaymentGateway {

    public void makePayment(String currency, double value) {
        System.out.println("External payment approved: " + currency + " " + value);
    }
}
