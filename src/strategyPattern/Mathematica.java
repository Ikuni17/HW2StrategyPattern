// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class Mathematica extends MathSoftware{
    public Mathematica(){
        // Default sorting algorithm
        sortStrategy = new InsertionSort();
        name = "Mathematica";
    }
}
