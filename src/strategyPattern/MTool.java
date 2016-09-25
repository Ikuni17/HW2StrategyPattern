package strategyPattern;

/**
 * Created by Brad on 9/25/2016.
 */
public class MTool extends MathSoftware{
    public MTool(){
        sortStrategy = new MergeSort();
    }

}
