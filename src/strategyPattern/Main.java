// Sam Congdon & Bradley White
// ESOF 322
// HW #2, Strategy Pattern
// September 25, 2016

package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter corresponding number for: 1. Mathematica, 2. MTool, 3. MyMath: ");
        int input = getInt();

        switch (input) {
            case 1:
                MathSoftware ms1 = new Mathematica();
                sort(ms1);
                dynamicSort(ms1);
                break;
            case 2:
                MathSoftware ms2 = new MTool();
                sort(ms2);
                dynamicSort(ms2);
                break;
            case 3:
                MathSoftware ms3 = new MTool();
                sort(ms3);
                dynamicSort(ms3);
                break;
        }
    }

    public static void sort(MathSoftware ms) {
        System.out.println("Starting " + ms.getName() + " using " + ms.sortStrategy.getName() + ".");
        System.out.print("The unsorted array is: ");
        ms.printArray(ms.array);
        ms.performSort(ms.array);
        System.out.print("The sorted array is: ");
        ms.printArray(ms.array);
        System.out.println();
    }

    public static void sort2(MathSoftware ms) {
        System.out.println("Starting " + ms.getName() + " using " + ms.sortStrategy.getName() + ".");
        System.out.print("The unsorted array is: ");
        ms.printArray(ms.array2);
        ms.performSort(ms.array2);
        System.out.print("The sorted array is: ");
        ms.printArray(ms.array2);
        System.out.println();
    }

    public static void dynamicSort(MathSoftware ms) throws IOException {
        System.out.print("Enter corresponding number to switch sorting algorithm: 1. Insertion Sort, 2. Bubble Sort, 3. Merge Sort: ");
        int input = getInt();

        switch (input) {
            case 1:
                ms.setSortStrategy(new InsertionSort());
                sort2(ms);
                break;
            case 2:
                ms.setSortStrategy(new BubbleSort());
                sort2(ms);
                break;
            case 3:
                ms.setSortStrategy(new MergeSort());
                sort2(ms);
                break;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    // -------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    //-------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
