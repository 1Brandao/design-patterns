public class Main {

    public static void main(String[] args) {

        // The main logic only knows the ComboFactory abstraction.
        // No concrete coffee or dessert is referenced here.
        ComboFactory[] factories = {
                new TraditionalComboFactory(),
                new FitnessComboFactory(),
                new PremiumComboFactory(),
                new VeganComboFactory()   // additional challenge
        };

        for (ComboFactory factory : factories) {
            OrderService orderService = new OrderService(factory);
            orderService.createCombo();
            System.out.println();
        }
    }
}
