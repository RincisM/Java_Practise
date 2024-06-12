import java.util.Scanner;

// Interpolation Search - Improvement over binary search
// Best used for uniformly distributed data
// Guessing where a value is based on a calculated probe results, if probe is incorrect
// search area is narrowed, and a new probe is calculated.

// worst case: O(n) [values increase exponentially]
// average case: O(log(log(n)))

public class IX_Interpolation_Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to be searched: ");
        int value = input.nextInt();
        int index = interpolationSearch(array, value);
        if(index != -1) {
            System.out.printf("\n%d Found at index %d",value, index);
        } else {
            System.out.printf("\n%d is not found", value);
        }
        input.close();
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;
        
        while(value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe: "+ probe);

            if(array[probe] == value) {
                return probe;
            } else if(array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
