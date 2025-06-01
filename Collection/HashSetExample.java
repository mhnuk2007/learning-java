package Collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate - will be ignored

        // Display elements (order not guaranteed)
        System.out.println("Names: " + names); // [Alice, Bob, Charlie]

        // Check size
        System.out.println("Size: " + names.size()); // 3

        // Contains
        System.out.println("Contains Bob? " + names.contains("Bob")); // true

        // Remove an element
        names.remove("Charlie");

        // Loop through the set
        for (String name : names) {
            System.out.println(name);
        }
    }
}
