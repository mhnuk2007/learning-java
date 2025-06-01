package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.addFirst("Elephant"); // Add at front
        animals.addLast("Lion");      // Add at end

        System.out.println("Animals: " + animals);

        // Access elements
        System.out.println("First animal: " + animals.getFirst()); // Elephant
        System.out.println("Last animal: " + animals.getLast());   // Lion

        // Remove elements
        animals.removeFirst();  // removes Elephant
        animals.removeLast();   // removes Lion
        System.out.println("After removals: " + animals);

        // Check if contains an element
        System.out.println("Contains Cat? " + animals.contains("Cat"));

        // Size of the list
        System.out.println("Size: " + animals.size());

        // Loop through the list
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
