// Concrete decorator.
public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getLabel() {
        return "whipped cream";
    }

    @Override
    protected double getExtraCost() {
        return 2.50;
    }
}
