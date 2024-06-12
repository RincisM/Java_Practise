import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int a = input.nextInt();
        System.out.print("\nEnter second number: ");
        int b = input.nextInt();
        System.out.print("\nEnter the Operator (+, -, *, /): ");
        String op = input.next();
        input.close();
        switch (op) {
            case "+":
                System.out.println("The Result is: "+ (a+b));
                break;
            case "-":
                System.out.println("The Result is: "+ (a-b));
                break;
            case "*":
                System.out.println("The Result is: "+ (a*b));
                break;
            case "/":
                if(b!=0) {
                    System.out.println("The Result is: "+ (a/b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("This is not a valid operator");
                break;
        }
    }
}