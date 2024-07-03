package generics.example01;

public class Main {
    public static void main(String[] args) {

        // Create a Box object that holds Integer values
        Box<Integer> integerBox = new Box<>();

        // Set the value to 10
        integerBox.set(10);

        // Print the value stored in integerBox
        System.out.println("Integer value: " + integerBox.get());

        // Create a Box object that holds String values
        Box<String> stringBox = new Box<>();

        // Set the value to "Hello world!"
        stringBox.set("Hello world!");

        // Print the value stored in stringBox
        System.out.println("String value: " + stringBox.get());
    }
}
