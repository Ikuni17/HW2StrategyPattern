/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Samuel
 */
package strategyPattern;

public class InsertionSort implements SortStrategy {
    public String name = "Insertion Sort";

    public int[] mathSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int j = i;
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
