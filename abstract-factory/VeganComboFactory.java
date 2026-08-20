// Additional challenge: only this new factory is needed to plug the vegan line in.
public class VeganComboFactory implements ComboFactory {

    @Override
    public Coffee createCoffee() {
        return new VeganCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new VeganDessert();
    }
}
