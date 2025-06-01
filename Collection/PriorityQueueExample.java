package Collection;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue: " + pq);  // Internally sorted
        System.out.println("Poll: " + pq.poll());    // 10 (smallest)
    }
}
