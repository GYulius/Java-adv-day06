package generics.example01;

// A generic class Box that can hold any type T
public class Box<T> {

    // A private variable of type T to store the value
    private T t;

    // Method to set the value of the box
    public void set(T t) {
        this.t = t;
    }

    // Method to get the value of the box
    public T get() {
        return this.t;
    }
}