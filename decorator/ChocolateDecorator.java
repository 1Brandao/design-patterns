// Concrete decorator.
public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getLabel() {
        return "chocolate";
    }

    @Override
    protected double getExtraCost() {
        return 2.00;
    }
}
