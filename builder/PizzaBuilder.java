// Builder: assembles a Pizza step by step, so only the desired ingredients are configured.
// Every method returns "this", which allows a readable and chainable creation.
public class PizzaBuilder {

    private String size = "Medium";
    private String dough = "Traditional";

    private boolean sauce;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean chicken;
    private boolean corn;
    private boolean onion;
    private boolean tomato;
    private boolean olive;
    private boolean stuffedCrust;

    // Additional challenge: sweet pizza ingredients.
    private boolean chocolate;
    private boolean strawberry;
    private boolean condensedMilk;

    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder dough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder sauce() {
        this.sauce = true;
        return this;
    }

    public PizzaBuilder cheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder pepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder bacon() {
        this.bacon = true;
        return this;
    }

    public PizzaBuilder chicken() {
        this.chicken = true;
        return this;
    }

    public PizzaBuilder corn() {
        this.corn = true;
        return this;
    }

    public PizzaBuilder onion() {
        this.onion = true;
        return this;
    }

    public PizzaBuilder tomato() {
        this.tomato = true;
        return this;
    }

    public PizzaBuilder olive() {
        this.olive = true;
        return this;
    }

    public PizzaBuilder stuffedCrust() {
        this.stuffedCrust = true;
        return this;
    }

    public PizzaBuilder chocolate() {
        this.chocolate = true;
        return this;
    }

    public PizzaBuilder strawberry() {
        this.strawberry = true;
        return this;
    }

    public PizzaBuilder condensedMilk() {
        this.condensedMilk = true;
        return this;
    }

    // Builds the final product with everything that was configured.
    public Pizza build() {
        return new Pizza(this);
    }

    String getSize() {
        return size;
    }

    String getDough() {
        return dough;
    }

    boolean hasSauce() {
        return sauce;
    }

    boolean hasCheese() {
        return cheese;
    }

    boolean hasPepperoni() {
        return pepperoni;
    }

    boolean hasBacon() {
        return bacon;
    }

    boolean hasChicken() {
        return chicken;
    }

    boolean hasCorn() {
        return corn;
    }

    boolean hasOnion() {
        return onion;
    }

    boolean hasTomato() {
        return tomato;
    }

    boolean hasOlive() {
        return olive;
    }

    boolean hasStuffedCrust() {
        return stuffedCrust;
    }

    boolean hasChocolate() {
        return chocolate;
    }

    boolean hasStrawberry() {
        return strawberry;
    }

    boolean hasCondensedMilk() {
        return condensedMilk;
    }
}
