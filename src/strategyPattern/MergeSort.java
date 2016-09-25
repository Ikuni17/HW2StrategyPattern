/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Samuel
 */
package strategyPattern;

public class MergeSort implements SortStrategy {
    public String name = "Merge Sort";

    public int[] mathSort(int[] array) {
        int length = array.length;
        int[] tempArray = new int[length];
        array = mergeSplit(array, 0, length, tempArray);
        return array;
    }//end mathSort

    public static int[] mergeSplit(int[] A, int start, int end, int[] B) {
        if ((end - start) < 2)
            return A;
        int middle = (start + end) / 2;
        A = mergeSplit(A, start, middle, B);
        A = mergeSplit(A, middle, end, B);
        A = merge(A, start, middle, end, B);
        A = copyArray(B, start, end, A);
        return A;
    }//end mergeSplit

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
