public class Electronics implements Product {
    private final String model;
    private final int priceInCents;

    public Electronics(String model, int priceInCents) {
        this.model = model;
        this.priceInCents = priceInCents;
    }

    public String getModel() {
        return model;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
