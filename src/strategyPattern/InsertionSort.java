// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class InsertionSort implements SortStrategy {
    public String name = "Insertion Sort";

    // Perform Insertion Sort algorithm
    public int[] mathSort(int[] array) {
        int length = array.length;
        // Loop through the entire array
        for (int i = 0; i < length; i++) {
            int j = i;
            // Swap elements until the correct position if found
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }//end while
        }//end for
        return array;
    }//end mathSort

    @Override
    public String getName() {
        return name;
    }
}//end InsertionSort
