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

        switch(input){
            case 1:
                MathSoftware ms1 = new Mathematica();
                System.out.print("The unsorted array is: ");
                ms1.printArray(ms1.array);
                ms1.performSort();
                System.out.print("The sorted array is: ");
                ms1.printArray(ms1.sortedArray);
                break;
            case 2:
                MathSoftware ms2 = new MTool();
                System.out.print("The unsorted array is: ");
                ms2.printArray(ms2.array);
                ms2.performSort();
                System.out.print("The sorted array is: ");
                ms2.printArray(ms2.sortedArray);
                break;
            case 3:
                MathSoftware ms3 = new MTool();
                System.out.print("The unsorted array is: ");
                ms3.printArray(ms3.array);
                ms3.performSort();
                System.out.print("The sorted array is: ");
                ms3.printArray(ms3.sortedArray);
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
