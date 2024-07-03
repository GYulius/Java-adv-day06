package collection.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Creating a HashSet to store fruits
        Set<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        // Trying to add a duplicate element to the HashSet
        boolean added = fruits.add("Apple");
        if (!added) {
            System.out.println("The element apple was not added again because it is a duplicate");
        }

        // Displaying all elements in the HashSet
        System.out.println("The set of fruits contains:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if a specific element is in the HashSet
        if (fruits.contains("Banana")) {
            System.out.println("The set contains banana");
        }

        // Removing an element from the HashSet
        fruits.remove("Apple");
        System.out.println("After removal the set contains " + fruits);

        // Creating a TreeSet from the HashSet to sort elements
        Set<String> sortedFruits = new TreeSet<>(fruits);
        sortedFruits.add("Kiwi"); // Adding another element to the TreeSet
        System.out.println("Sorted elements in the treeset: " + sortedFruits);

        // Creating a LinkedHashSet to maintain insertion order
        Set<String> orderedFruits = new LinkedHashSet<>();
        orderedFruits.add("Peach");
        orderedFruits.addAll(sortedFruits); // Adding all elements from the sorted TreeSet
        System.out.println("The set with elements in insertions order: " + orderedFruits);

        // Iterating through the LinkedHashSet
        Iterator<String> iterator = orderedFruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // Removing "Banana" from the set during iteration
            }
            System.out.println(fruit); // Printing each element
        }

        // Displaying the LinkedHashSet after removal of "Banana"
        System.out.println("The set after removing Banana: " + orderedFruits);
    }
}
