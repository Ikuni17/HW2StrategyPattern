/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Samuel
 */
package strategyPattern;

public interface SortStrategy {
    public int[] mathSort(int[] array);

    public String getName();
}//end SortStrategy
