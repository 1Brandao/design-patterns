// Abstract Factory: declares the creation of a whole family of related products.
// Every concrete factory must return products that belong to the same product line.
public interface ComboFactory {

    Coffee createCoffee();

    Dessert createDessert();

}
