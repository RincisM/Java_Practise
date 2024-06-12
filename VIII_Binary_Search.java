// import java.util.Arrays;
import java.util.Scanner;

// Binary Search - finds the position of a target value within a sorted array
// Half of the array is eliminated during each step
// Useful for large dataset

public class VIII_Binary_Search {
    public static void main(String[] args) {
        int[] array = new int[1000000];

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to be searched: ");
        int value = input.nextInt();

        // int index = Arrays.binarySearch(array, value); //This is an inbuilt method

        // Algorithm from scratch

        int index = binarySearch(array, value);

        if(index != -1) {
            System.out.printf("\n%d Found at index %d",value, index);
        } else {
            System.out.printf("\n%d is not found", value);
        }

        input.close();
    }

    private static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length -1;

        while(start < end) {
            int middle = start + (end - start) / 2;
            int number = array[middle];
            System.out.println("Middle Term: " + middle);
            if(number < value) {
                start = middle + 1;
            } else if (number > value) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
