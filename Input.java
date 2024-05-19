import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = input.next();
        System.out.println("Hello " + name);
        input.close();
    }
}
