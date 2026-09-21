// Component: the abstraction the client depends on. Both the plain drinks and
// the decorators implement it, which is what makes them interchangeable.
public interface Beverage {

    String getDescription();

    double getCost();

}
