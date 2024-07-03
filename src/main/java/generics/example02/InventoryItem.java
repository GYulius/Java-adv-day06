package generics.example02;

// A generic class InventoryItem that can hold any type T
public class InventoryItem<T> {
    private String name;   // Name of the inventory item
    private int quantity;  // Quantity of the inventory item
    private T detail;      // Additional detail of the inventory item of type T

    // Constructor to initialize the inventory item
    public InventoryItem(String name, int quantity, T detail) {
        this.name = name;
        this.quantity = quantity;
        this.detail = detail;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter method for detail
    public T getDetail() {
        return detail;
    }

    // Setter method for detail
    public void setDetail(T detail) {
        this.detail = detail;
    }

    // Method to print item details
    public void printItemDetails() {
        System.out.println("Item: " + name + " with quantity: " + quantity + " and details: " + detail);
    }
}