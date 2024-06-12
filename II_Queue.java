import java.util.LinkedList;
import java.util.Queue;

//Queue is a FIFO data data structure

public class II_Queue {
    public static void main(String[] args) {
        //Queue is an Interface and Linkedlist is a class which implements queue so we are using Queue
        Queue<String> queue = new LinkedList<>();
        
        //Enqueuing a Queue - Add an element to the queue
        queue.offer("Alice");
        queue.offer("John");
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Jack");

        //Printing the Queue
        System.out.println(queue);

        //Finding the object at the head of the queue
        System.out.println(queue.peek());

        //Removing the Element from the queue
        queue.poll();
        queue.poll();

        System.out.println(queue);

        //Checking if the queue is empty
        System.out.println(queue.isEmpty());

        //Checking size of the queue
        System.out.println(queue.size());

        //Checking if an object is present in the queue
        System.out.println(queue.contains("Jack"));  //This does not give the index, its says true or false;
    }
}
