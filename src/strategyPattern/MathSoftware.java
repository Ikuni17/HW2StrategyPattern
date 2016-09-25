// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

// Super class
public abstract class MathSoftware {
    // Inherited variables
    // The sorting algorithm
    SortStrategy sortStrategy;
    // The two test arrays to be sorted
    int[] array = {1, 3, 4, 6, 8, 9, 7, 2, 5, 0};
    int[] array2 = {10, 14, 11, 19, 12, 18, 13, 17, 15, 16};
    String name = "Math Software";

    // Empty constructor
    public MathSoftware() {
    }

    // Call the sorting algorithm on the array parameter
    public void performSort(int[] a) {
        a = sortStrategy.mathSort(a);
    }

    // Change the default sorting algorithm to the users choice
    public void setSortStrategy(SortStrategy ss) {
        sortStrategy = ss;
    }

    // Loop through the array and print it out
    public void printArray(int[] b) {
        for (int i = 0; i < b.length; i++ ){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    // Return the name of the Math Software
    public String getName() {
        return name;
    }
}
