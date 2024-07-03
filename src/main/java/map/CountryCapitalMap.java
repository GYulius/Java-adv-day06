package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryCapitalMap {
    public static void main(String[] args) {
        // Creating a HashMap to store country-capital pairs
        Map<String, String> countryCapitals = new HashMap<>();

        // Adding country-capital pairs to the HashMap
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("India", "New Delhi");

        // Checking if a specific country is in the HashMap
        String country = "Ukraine";
        if (countryCapitals.containsKey(country)) {
            // If the country is found, print its capital
            System.out.println("The capital of " + country + " is " + countryCapitals.get(country));
        } else {
            // If the country is not found, print a message
            System.out.println("Capital not found for country " + country);
        }

        // Using an iterator to go through the entries of the HashMap
        Iterator<Map.Entry<String, String>> iterator = countryCapitals.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            // Printing each country-capital pair
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Using a for-each loop to go through the entries of the HashMap
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            // Printing each country-capital pair
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
