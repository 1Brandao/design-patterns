public class Pizza {

    private final String size;
    private final String dough;

    private final boolean sauce;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean chicken;
    private final boolean corn;
    private final boolean onion;
    private final boolean tomato;
    private final boolean olive;
    private final boolean stuffedCrust;

    // Additional challenge: sweet pizza ingredients.
    private final boolean chocolate;
    private final boolean strawberry;
    private final boolean condensedMilk;

    // Package-private on purpose: a Pizza can only be created through the PizzaBuilder.
    Pizza(PizzaBuilder builder) {
        this.size = builder.getSize();
        this.dough = builder.getDough();
        this.sauce = builder.hasSauce();
        this.cheese = builder.hasCheese();
        this.pepperoni = builder.hasPepperoni();
        this.bacon = builder.hasBacon();
        this.chicken = builder.hasChicken();
        this.corn = builder.hasCorn();
        this.onion = builder.hasOnion();
        this.tomato = builder.hasTomato();
        this.olive = builder.hasOlive();
        this.stuffedCrust = builder.hasStuffedCrust();
        this.chocolate = builder.hasChocolate();
        this.strawberry = builder.hasStrawberry();
        this.condensedMilk = builder.hasCondensedMilk();
    }

    public String describe() {

        StringBuilder description = new StringBuilder();

        description.append(size).append(" pizza | ").append(dough).append(" dough");
        description.append("\nIngredients: ");

        StringBuilder ingredients = new StringBuilder();

        appendIngredient(ingredients, sauce, "sauce");
        appendIngredient(ingredients, cheese, "cheese");
        appendIngredient(ingredients, pepperoni, "pepperoni");
        appendIngredient(ingredients, bacon, "bacon");
        appendIngredient(ingredients, chicken, "chicken");
        appendIngredient(ingredients, corn, "corn");
        appendIngredient(ingredients, onion, "onion");
        appendIngredient(ingredients, tomato, "tomato");
        appendIngredient(ingredients, olive, "olive");
        appendIngredient(ingredients, chocolate, "chocolate");
        appendIngredient(ingredients, strawberry, "strawberry");
        appendIngredient(ingredients, condensedMilk, "condensed milk");
        appendIngredient(ingredients, stuffedCrust, "stuffed crust");

        description.append(ingredients.length() == 0 ? "none" : ingredients);

        return description.toString();
    }

    private void appendIngredient(StringBuilder ingredients, boolean selected, String name) {
        if (selected) {
            if (ingredients.length() > 0) {
                ingredients.append(", ");
            }
            ingredients.append(name);
        }
    }

    @Override
    public String toString() {
        return describe();
    }
}
