import java.util.LinkedList;

//Linkedlist has address along with the data. They are dynamic data structure with greater memory usage.
//They are bad at searching but good at inserting and deleting

public class IV_Linked_List {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(); //This is a Doubly Linked List
        //Linkedlist class implements deque interface - double ended queue

        //LinkedList as a stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("E");
        // linkedList.push("F");

        // linkedList.pop();

        // System.out.println(linkedList);

        //LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("E");
        linkedList.offer("F");

        // linkedList.poll();

        System.out.println(linkedList);

        //Adding an element to the linkedlist  in between
        linkedList.add(4, "E");
        
        //Remove an element from the linkedlist
        linkedList.remove("E");

        System.out.println(linkedList);

        //Finding the First element
        System.out.println(linkedList.peekFirst());

        //Finding the Last element
        System.out.println(linkedList.peekLast());

        //Adding Element at the First
        linkedList.addFirst("O");

        //Adding Element to the Last
        linkedList.addLast("G");

        //Removing Element from the First
        String first = linkedList.removeFirst();
        System.out.println(first);

        //Remove Element from the Last
        String last = linkedList.removeLast();
        System.out.println(last);


        //Finding an element from the linkedlist
        System.out.println(linkedList.indexOf("F"));
    }
}
