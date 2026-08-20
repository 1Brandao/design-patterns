public class OrderService {

    // The service receives a factory and never knows the concrete products.
    private final ComboFactory factory;

    public OrderService(ComboFactory factory) {
        this.factory = factory;
    }

    public void createCombo() {

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        coffee.prepare();
        dessert.prepare();

        System.out.println("Combo is ready!");
    }
}
