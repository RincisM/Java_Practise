import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Priority Queue is a FIFO data structure, with priorities.

public class III_Priority_Queue {
    public static void main(String[] args) {
        Queue<Double> pQueue = new PriorityQueue<>();

        //The above declaration arranges the number in Ascending order. To make it to descending order, we can use like
        //Queue<Double> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        //Adding objects to the Queue
        pQueue.offer(3.0);
        pQueue.offer(1.4);
        pQueue.offer(4.8);
        pQueue.offer(2.0);
        pQueue.offer(2.5);

        while(!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("A");
        queue.offer("C");
        queue.offer("B");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
