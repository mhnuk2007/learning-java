package Collection;

import java.util.ArrayList;
import java.util.Collections; // For sort and binarySearch
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {

        // Create an ArrayList of Strings to store fruit names
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list (duplicates are allowed)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Duplicate allowed

        // Display the entire list
        System.out.println("Fruits: " + fruits); // [Apple, Banana, Mango, Banana]

        // Get element at index 1
        System.out.println("Second fruit: " + fruits.get(1)); // Banana

        // Replace element at index 2
        fruits.set(2, "Orange");
        System.out.println("After replacement: " + fruits); // [Apple, Banana, Orange, Banana]

        // Remove element at index 3
        fruits.remove(3);
        System.out.println("After removal: " + fruits); // [Apple, Banana, Orange]

        // Check if list contains a specific element
        System.out.println("Contains Apple? " + fruits.contains("Apple")); // true

        // Get the current size of the list
        System.out.println("Size: " + fruits.size()); // 3

        // _______________________
        System.out.println("_______________________");
        System.out.println("Looping through fruits:");
        System.out.println("_______________________");

        // Classic for loop
        System.out.println("Classic for loop:");
        System.out.println("_________________");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Enhanced for loop (for-each)
        System.out.println("___________________");
        System.out.println("Enhanced for loop:");
        System.out.println("___________________");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterator loop
        System.out.println("_________");
        System.out.println("Iterator:");
        System.out.println("_________");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Sort the list in ascending order (alphabetically)
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits); // [Apple, Banana, Orange]

        // Search for an element using binarySearch (list must be sorted)
        int index = Collections.binarySearch(fruits, "Orange");
        if (index >= 0) {
            System.out.println("Found 'Orange' at index: " + index);
        } else {
            System.out.println("'Orange' not found.");
        }

        // Convert the ArrayList to a simple array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array elements:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
