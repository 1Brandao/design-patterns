import java.util.Objects;

public class ShippingCalculator {
    private ShippingStrategy strategy;

    public ShippingCalculator(ShippingStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy");
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy");
    }

    public double calculate(double weight) {
        return strategy.calculate(weight);
    }
}
