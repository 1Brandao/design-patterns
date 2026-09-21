// Prototype: the contract that allows an object to produce a copy of itself.
// Clients depend on this abstraction instead of calling a concrete constructor.
public interface Prototype<T> {

    T clonePrototype();

}
