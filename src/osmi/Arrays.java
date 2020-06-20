package osmi;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " , typed value was " + myIntegers[i]);
        }
        System.out.println("Average is "+ getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    private static final Scanner scanner = new Scanner(System.in);
    
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i =0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    static String toString(int[] myIntArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}