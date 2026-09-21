public class Main {

    public static void main(String[] args) {

        // The original implementation still works.
        new OrderService(new CreditCardPayment()).checkout(150.00);

        // The external gateway is reached through the adapter.
        new OrderService(new ExternalPaymentGatewayAdapter("BRL")).checkout(150.00);

        System.out.println();

        // Additional challenge: several currencies, chosen only when the
        // adapter is built. OrderService remains untouched.
        String[] currencies = {"BRL", "USD", "EUR"};

        for (String currency : currencies) {
            PaymentProcessor processor = new ExternalPaymentGatewayAdapter(currency);
            new OrderService(processor).checkout(99.90);
        }
    }
}
