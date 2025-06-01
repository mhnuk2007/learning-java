package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");  // Duplicate - will be ignored
        fruits.add(null);      // Null allowed

        System.out.println("Fruits: " + fruits); // Output: [Apple, Banana, Orange, null]

        // Remove an item
        fruits.remove("Orange");

        // Check if contains
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // Iterate through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
