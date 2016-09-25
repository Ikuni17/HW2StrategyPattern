// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

public class MyMath extends MathSoftware {
    public MyMath(){
        // Default sorting algorithm
        sortStrategy = new BubbleSort();
        name = "MyMath";
    }
}
