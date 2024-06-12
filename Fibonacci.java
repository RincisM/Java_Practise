import java.util.Scanner;

public class Fibonacci {
    static int a = 0, b = 1, c;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        input.close();
        if(num > 0) {
            System.out.print(0);
        }
        if(num > 1) {
            System.out.print(", "+ 1);
        }
        fibonacci(num-2);
    }
    public static void fibonacci(int num) {
        if(num > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", "+ c);
            fibonacci(num-1);
        }
    }
}
