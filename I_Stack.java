import java.util.Stack;

//Stack is a LIFO data structure

public class I_Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        //Checking if the stack is empty
        System.out.println(stack.empty());

        //Adding an object to stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C");

        //Again checking if the stack is empty
        System.out.println(stack.empty());

        //Printing the stack
        System.out.println(stack);

        //Remove the top object from the stack
        String favLanguage = stack.pop();
        System.out.println(favLanguage);
        System.out.println(stack);

        //Getting the top of the object of the stack
        System.out.println(stack.peek());

        //Searching the object in the stack
        System.out.println(stack.search("Python"));
        System.out.println(stack.search("Java"));
    }
}
