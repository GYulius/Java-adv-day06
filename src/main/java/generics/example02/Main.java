package generics.example02;

public class Main {
    public static void main(String[] args) {
        // Creating an inventory manager for books with details as String
        InventoryManager<String> bookInventory = new InventoryManager<>();

        // Adding books to the inventory
        bookInventory.addItem(new InventoryItem<>("1984", 15, "George Orwell"));
        bookInventory.addItem(new InventoryItem<>("The Great Gatsby", 10, "Scott Fitzgerald"));

        // Displaying the book inventory items
        bookInventory.displayItems();

        // Creating an inventory manager for electronics with details as Integer (e.g., model number)
        InventoryManager<Integer> electronicsInventory = new InventoryManager<>();

        // Adding electronics to the inventory
        electronicsInventory.addItem(new InventoryItem<>("Laptop", 5, 101));
        electronicsInventory.addItem(new InventoryItem<>("Smartphone", 20, 202));

        // Displaying the electronics inventory items
        electronicsInventory.displayItems();
    }
}