// Bubble Sort - Compare nearby elements and change their position if not sorted.
// Time Complexity = O(n^2) -> quadratic time complexity

public class X_Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(array);
        for(int i: array) {
            System.out.print(i+ ", ");
        }
    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length -1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
