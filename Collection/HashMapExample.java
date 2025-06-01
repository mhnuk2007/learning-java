package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 3);
        fruits.put("Banana", 5);
        fruits.put("Orange", 2);

        System.out.println(fruits); // {Apple=3, Banana=5, Orange=2}

        // Accessing a value
        System.out.println("Apples: " + fruits.get("Apple")); // 3

        // Iterating using for loop
        for (String key : fruits.keySet()) {
            System.out.println(key + " => " + fruits.get(key));
        }

        // Iterating using Map.Entry Interface
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
