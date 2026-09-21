// Base decorator: implements the same abstraction and wraps another Beverage,
// delegating to it and letting each subclass add its own part.
public abstract class BeverageDecorator implements Beverage {

    protected final Beverage beverage;

    protected BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    protected abstract String getLabel();

    protected abstract double getExtraCost();

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + getLabel();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + getExtraCost();
    }
}
