package strategyPattern;

/**
 * Created by Brad on 9/25/2016.
 */
public class MyMath extends MathSoftware {
    public MyMath(){
        sortStrategy = new BubbleSort();
        name = "MyMath";
    }
}
