public class Main {

    public static void main(String[] args) {

        // No huge constructor with positional parameters anymore:
        // each ingredient is set by its own method and reads like a sentence.
        Pizza pepperoniPizza = new PizzaBuilder()
                .size("Large")
                .dough("Traditional")
                .sauce()
                .cheese()
                .pepperoni()
                .onion()
                .build();

        Pizza portuguesePizza = new PizzaBuilder()
                .size("Medium")
                .dough("Thin")
                .sauce()
                .cheese()
                .bacon()
                .onion()
                .tomato()
                .olive()
                .build();

        Pizza customPizza = new PizzaBuilder()
                .size("Small")
                .dough("Whole Wheat")
                .cheese()
                .chicken()
                .corn()
                .stuffedCrust()
                .build();

        // Additional challenge: sweet pizza built with the new ingredients.
        Pizza sweetPizza = new PizzaBuilder()
                .size("Large")
                .dough("Sweet")
                .chocolate()
                .strawberry()
                .condensedMilk()
                .build();

        System.out.println("Pepperoni Pizza");
        System.out.println(pepperoniPizza);
        System.out.println();

        System.out.println("Portuguese Pizza");
        System.out.println(portuguesePizza);
        System.out.println();

        System.out.println("Custom Pizza");
        System.out.println(customPizza);
        System.out.println();

        System.out.println("Sweet Pizza");
        System.out.println(sweetPizza);
    }
}
