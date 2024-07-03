package generics.example03;

// DVD class that extends Item
public class DVD extends Item {
    private String director; // Director of the DVD

    // Constructor to initialize name and director
    public DVD(String name, String director) {
        super(name);
        this.director = director;
    }

    // Getter method for director
    public String getDirector() {
        return director;
    }

    // Setter method for director
    public void setDirector(String director) {
        this.director = director;
    }

    // Overriding toString method to provide custom string representation
    @Override
    public String toString() {
        return "DVD{" + getName() +
                ", director='" + director + '\'' +
                '}';
    }
}