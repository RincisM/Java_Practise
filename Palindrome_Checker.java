import java.util.Scanner;
import java.util.Stack;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String ques = input.nextLine().toLowerCase();
        Stack<Character> result = new Stack<>();
        String orig = "";
        for(int i = 0; i< ques.length(); i++) {
            if(ques.charAt(i) != ' ') {
                orig += ques.charAt(i);
                result.push(ques.charAt(i));
            } else {
                continue;
            }
        }
        String rever = "";
        while(!result.empty()) {
            rever += result.pop();
        }
        if(rever.equals(orig)){
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }
        input.close();
    }
}
