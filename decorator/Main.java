public class Main {

    public static void main(String[] args) {

        // The client only ever handles the Beverage abstraction.
        Beverage plainCoffee = new Coffee();

        Beverage coffeeWithMilkAndChocolate =
                new ChocolateDecorator(new MilkDecorator(new Coffee()));

        Beverage teaWithMilk = new MilkDecorator(new Tea());

        // The same add-on applied twice, accumulating description and price.
        Beverage doubleChocolateCoffee =
                new ChocolateDecorator(new ChocolateDecorator(new Coffee()));

        print(plainCoffee);
        print(coffeeWithMilkAndChocolate);
        print(teaWithMilk);
        print(doubleChocolateCoffee);

        System.out.println();

        // Additional challenge: caramel added on top of an existing combination.
        Beverage caramelCombo = new CaramelDecorator(
                new WhippedCreamDecorator(new MilkDecorator(new Coffee()))
        );

        print(caramelCombo);
    }

    // Depends only on Beverage: it never knows how many decorators are wrapped.
    private static void print(Beverage beverage) {
        System.out.printf("%s -> R$ %.2f%n", beverage.getDescription(), beverage.getCost());
    }
}
