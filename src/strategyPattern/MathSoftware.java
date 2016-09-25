package strategyPattern;

/**
 * Created by Brad on 9/25/2016.
 */
public abstract class MathSoftware {
    SortStrategy sortStrategy;
    int[] array = {1,3,4,6,8,9,7,2,5,0};
    int[] sortedArray;

    public MathSoftware(){}

    public void performSort(){
        sortedArray = sortStrategy.mathSort(array);
    }

    public void setSortStrategy(SortStrategy ss){
        sortStrategy = ss;
    }

    public void printArray(int[] a){
        for (int i:a) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
