// Insertiong Sort - After comparing elements to the left
// shift elements to the right to make room to insert a value
// Time Complexity - O(n^2) - Quadratic

// Less Stems than Bubble sort
// Best case is O(n) compared to Selection Sort O(n^2)

public class XII_Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        insertionSort(array);
        for(int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
