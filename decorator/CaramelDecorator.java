// Additional challenge: a new add-on created without touching any existing
// beverage or decorator.
public class CaramelDecorator extends BeverageDecorator {

    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    protected String getLabel() {
        return "caramel";
    }

    @Override
    protected double getExtraCost() {
        return 1.00;
    }
}
