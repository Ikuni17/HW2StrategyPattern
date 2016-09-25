// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public interface SortStrategy {
    // Return the int array after it has been passed as a parameter, redundant because of pass by reference
    int[] mathSort(int[] array);

    // Return the name of a sorting algorithm
    String getName();
}//end SortStrategy
