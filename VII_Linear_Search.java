import java.util.Scanner;

// Linear Search - Iterating through a collection one element at a time
// The Run Time Complexity of Linear Search is O(n)
// Slow on Large Dataset
// No need to be sorted
// Useful for data structures that do not have random access like Linked List

public class VII_Linear_Search {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number to be found: ");
        int value = input.nextInt();

        int index = linearSearch(array, value);

        if(index != -1) {
            System.out.printf("\n%d Found at index %d",value, index);
        } else {
            System.out.printf("\n%d is not found", value);
        }

        input.close();
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(value == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
