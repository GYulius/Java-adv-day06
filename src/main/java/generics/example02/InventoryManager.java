package generics.example02;

import java.util.ArrayList;
import java.util.List;

// A generic class InventoryManager that manages a list of InventoryItem objects
public class InventoryManager<T> {

    // List to hold inventory items of type InventoryItem<T>
    private List<InventoryItem<T>> items = new ArrayList<>();

    // Method to add an inventory item to the list
    public void addItem(InventoryItem<T> item) {
        items.add(item);
    }

    // Method to remove an inventory item from the list
    public void removeItem(InventoryItem<T> item) {
        items.remove(item);
    }

    // Method to display all inventory items
    public void displayItems() {
        for (InventoryItem<T> item : items) {
            item.printItemDetails();
        }
    }
}
