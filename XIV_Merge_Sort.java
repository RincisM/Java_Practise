// Merge Sort - Divide and Conquer Algorithm
// It is a recurse function
// Time Complexity - O(n log n) - Quasilinear Time
// Space Complexity - O(n)
// Uses more space

public class XIV_Merge_Sort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        mergeSort(array);
        for(int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for(int i = 0, j = 0; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
