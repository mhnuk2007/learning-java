package Collection;

import java.util.*;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");

        System.out.println("Queue: " + queue);  // [X, Y, Z]
    }
}
