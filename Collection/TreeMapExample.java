package Collection;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> capitals = new TreeMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington");
        capitals.put("France", "Paris");

        System.out.println(capitals); // Sorted by key: {France=Paris, India=New Delhi, USA=Washington}
    }
}
