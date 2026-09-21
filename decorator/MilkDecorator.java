// Concrete decorator.
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getLabel() {
        return "milk";
    }

    @Override
    protected double getExtraCost() {
        return 1.50;
    }
}
