package map;

import java.util.Objects;

// Class representing a Person with firstName, lastName, and age attributes
public class Person {
    private String firstName; // First name of the person
    private String lastName;  // Last name of the person
    private int age;          // Age of the person

    public int height; // Height of the person (public field)

    // Constructor to initialize firstName, lastName, and age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overriding the equals method to compare Person objects based on firstName and lastName
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the objects are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check if obj is null or not the same class
        Person person = (Person) obj; // Cast obj to Person
        return firstName.equals(person.firstName) && lastName.equals(person.lastName); // Compare firstName and lastName
    }

    // Overriding the hashCode method to generate a hash code based on firstName and lastName
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName); // Generate hash code using firstName and lastName
    }

    public static void main(String[] args) {
        // Create two Person objects with the same firstName and lastName but different ages
        Person p1 = new Person("Ion", "Popescu", 30);
        Person p2 = new Person("Ion", "Popescu", 70);

        // Print the result of comparing p1 and p2 using the equals method
        System.out.println(p1.equals(p2)); // Output: true
    }
}
