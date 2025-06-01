package Collection;

import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        // Declare and initialize a List of Strings using ArrayList
        List<String> languages = new ArrayList<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // Duplicate allowed

        // Access elements
        System.out.println("First: " + languages.get(0)); // Java

        // Replace element
        languages.set(2, "JavaScript");
        System.out.println("Updated List: " + languages);

        // Remove an element
        languages.remove("Java");
        System.out.println("After removal: " + languages);

        // Check size
        System.out.println("Size: " + languages.size());

        // Loop using enhanced for loop
        for (String lang : languages) {
            System.out.println(lang);
        }

        // Check if contains a value
        System.out.println("Contains Python? " + languages.contains("Python"));
    }
}
