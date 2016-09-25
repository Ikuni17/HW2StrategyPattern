// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class BubbleSort implements SortStrategy {
    public String name = "Bubble Sort";

    // Perform Bubble Sort algorithm
    public int[] mathSort(int[] array) {
        int length = array.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            // Loop until the element is in correct position
            for (int i = 1; i < length; i++) {
                // Swap elements if the i-1 element is greater than the i element
                if (array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }//end if
            }//end for
        }//end while
        return array;
    }//end mathSort

    @Override
    public String getName() {
        return name;
    }
}//end bubbleSort
