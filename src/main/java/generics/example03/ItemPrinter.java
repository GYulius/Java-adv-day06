package generics.example03;

import java.util.List;

// Class with a method to print details of items
public class ItemPrinter {

    // Method to print details of a list of items
    public static void printItemDetails(List<? extends Item> items) {
        for (Item item : items)
            System.out.println(item);
    }

    public static void main(String[] args) {
        // List of books
        List<Book> books = List.of(
                new Book("1984", "George Orwell"),
                new Book("The Hobbit", "Tolkien")
        );

        // List of DVDs
        List<DVD> dvds = List.of(
                new DVD("The Matrix", "Director 1"),
                new DVD("ABC", "Director 2")
        );

        // List of generic items
        List<Item> items = List.of(
                new Item("Item 1"),
                new Item("Item 2")
        );

        // Print details of books, DVDs, and generic items
        printItemDetails(books);
        printItemDetails(dvds);
        printItemDetails(items);
    }
}