package Collection;

import java.util.*;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);  // [A, B, C]
        System.out.println("Peek: " + queue.peek()); // A
        System.out.println("Poll: " + queue.poll()); // A
        System.out.println("After Poll: " + queue);  // [B, C]
    }
}
