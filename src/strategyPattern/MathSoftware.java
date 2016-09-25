package strategyPattern;

/**
 * Created by Brad on 9/25/2016.
 */
public abstract class MathSoftware {
    SortStrategy sortStrategy;
    int[] array = {1, 3, 4, 6, 8, 9, 7, 2, 5, 0};
    int[] array2 = {10, 14, 11, 19, 12, 18, 13, 17, 15, 16};
    String name = "Math Software";

    public MathSoftware() {
    }

    public void performSort(int[] a) {
        a = sortStrategy.mathSort(a);
    }

    public void setSortStrategy(SortStrategy ss) {
        sortStrategy = ss;
    }

    public void printArray(int[] b) {
        for (int i = 0; i < b.length; i++ ){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
