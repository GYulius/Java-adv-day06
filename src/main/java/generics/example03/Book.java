package generics.example03;

// Book class that extends Item
public class Book extends Item {
    private String author; // Author of the book

    // Constructor to initialize name and author
    public Book(String name, String author) {
        super(name);
        this.author = author;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Overriding toString method to provide custom string representation
    @Override
    public String toString() {
        return "Book{" + getName() +
                ", author='" + author + '\'' +
                '}';
    }
}