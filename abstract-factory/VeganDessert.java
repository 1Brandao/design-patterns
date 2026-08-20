// Additional challenge: a new product family added without touching the existing code.
public class VeganDessert implements Dessert {

    @Override
    public void prepare() {
        System.out.println("Preparing Vegan Brownie");
    }
}
