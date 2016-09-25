/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Samuel
 */

package strategyPattern;

public class BubbleSort implements SortStrategy {
    public String name = "Bubble Sort";

    public int[] mathSort(int[] array) {
        int length = array.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < length; i++) {
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
