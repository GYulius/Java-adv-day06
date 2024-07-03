package generics.example03;

// Base class Item with name field
public class Item {
    private String name; // Name of the item

    // Constructor to initialize name
    public Item(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Overriding toString method to provide custom string representation
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}