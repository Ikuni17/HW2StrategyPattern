// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class MergeSort implements SortStrategy {
    public String name = "Merge Sort";

    // Perform the Merge Sort algorithm
    public int[] mathSort(int[] array) {
        int length = array.length;
        // Create working array
        int[] tempArray = new int[length];
        // Begin recursion
        array = mergeSplit(array, 0, length, tempArray);
        // Return sorted array
        return array;
    }//end mathSort

    public static int[] mergeSplit(int[] A, int start, int end, int[] B) {
        // Split the arrays until they are less than 2 elements
        if ((end - start) < 2)
            return A;
        int middle = (start + end) / 2;
        A = mergeSplit(A, start, middle, B);
        A = mergeSplit(A, middle, end, B);
        // Call helper to combine
        A = merge(A, start, middle, end, B);
        A = copyArray(B, start, end, A);
        return A;
    }//end mergeSplit

    // Combine the sub arrays
    public static int[] merge(int[] A, int start, int middle, int end, int[] B) {
        int i = start;
        int j = middle;
        for (int k = start; k < end; k++) {
            if (i < middle && (j >= end || A[i] <= A[j])) {
                B[k] = A[i];
                i++;
            } else {
                B[k] = A[j];
                j++;
            }
        }//end for
        return A;
    }//end merge

    public static int[] copyArray(int[] B, int start, int end, int[] A) {
        for (int k = start; k < end; k++)
            A[k] = B[k];
        return A;
    }//end copyArray

    @Override
    public String getName() {
        return name;
    }
}//end MergeSort
