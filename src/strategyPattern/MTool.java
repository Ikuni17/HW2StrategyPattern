// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class MTool extends MathSoftware{
    public MTool(){
        // Default sorting algorithm
        sortStrategy = new MergeSort();
        name = "MTool";
    }
}
