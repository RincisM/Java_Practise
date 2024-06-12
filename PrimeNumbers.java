import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if(num < 2) {
            System.out.println("No prime Numbers");
        } else {
            System.out.print(2);
            for(int i = 3; i < num; i++) {
                for(int j = 2; j <= Math.sqrt(num);) {
                    if(i%j==0) {
                        break;
                    }
                    System.out.print(", "+i);
                    break;
                }
            }
        }
        input.close();
    }
}
