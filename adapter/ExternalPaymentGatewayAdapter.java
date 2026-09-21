// Adapter: implements the interface the system expects and translates the call
// into the one the external gateway requires, keeping that detail in one place.
public class ExternalPaymentGatewayAdapter implements PaymentProcessor {

    private final ExternalPaymentGateway gateway;

    // Additional challenge: the currency is configured once, here, and never
    // leaks into OrderService.
    private final String currency;

    public ExternalPaymentGatewayAdapter(String currency) {
        this(new ExternalPaymentGateway(), currency);
    }

    public ExternalPaymentGatewayAdapter(ExternalPaymentGateway gateway, String currency) {
        this.gateway = gateway;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        gateway.makePayment(currency, amount);
    }
}
