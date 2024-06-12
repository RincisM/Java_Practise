import java.util.Scanner;

public class SortingBubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int num = input.nextInt();
        int[] result = new int[num];
        System.out.println("Enter the Data: ");
        for(int i = 0; i < num; i++) {
            result[i] = input.nextInt();
        }
        input.close();
        for(int i = 0; i < result.length-1; i++){
            for(int j = 0; j < result.length-1; j++) {
                if(result[j] > result[j+1]) {
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        for(int i: result) {
            System.out.print(i);
        }
    }
}
