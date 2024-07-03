package generics.example03;

import java.util.ArrayList;
import java.util.List;

// Class demonstrating usage of generics with numbers
public class NumberExample {

    // Method to add integers to a list that can accept Integer or its superclasses
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(1);
        numbers.add(2);
        numbers.add(30);
    }

    // Method to print all elements of a list
    public static void printNumbers(List<?> numbers) {
        for (Object number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // Create a list of numbers
        List<Number> numberList = new ArrayList<>();

        // Add integers to the list
        addNumbers(numberList);

        // Print the numbers in the list
        printNumbers(numberList);
    }
}