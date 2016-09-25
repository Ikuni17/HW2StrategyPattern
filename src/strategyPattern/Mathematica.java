package strategyPattern;

/**
 * Created by Brad on 9/25/2016.
 */
public class Mathematica extends MathSoftware{
    public Mathematica(){
        sortStrategy = new InsertionSort();
    }
}
