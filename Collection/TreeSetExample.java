package Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Sorted numbers: " + numbers); // [10, 30, 50]
    }
}
