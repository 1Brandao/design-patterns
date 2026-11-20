import java.util.Locale;

public class Main {
    private static final Locale BRAZIL = Locale.forLanguageTag("pt-BR");

    public static void main(String[] args) {
        double weight = 3.0;
        ShippingCalculator calculator = new ShippingCalculator(new StandardShipping());
        print("Standard", calculator.calculate(weight));

        calculator.setStrategy(new ExpressShipping());
        print("Express", calculator.calculate(weight));

        calculator.setStrategy(new StorePickup());
        print("Pickup", calculator.calculate(weight));

        calculator.setStrategy(new EconomyShipping());
        print("Economy", calculator.calculate(weight));
    }

    private static void print(String deliveryType, double price) {
        System.out.printf(BRAZIL, "%s: R$ %.2f%n", deliveryType, price);
    }
}
