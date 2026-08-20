// Additional challenge: a new product family added without touching the existing code.
public class VeganCoffee implements Coffee {

    @Override
    public void prepare() {
        System.out.println("Preparing Vegan Coffee with oat milk");
    }
}
