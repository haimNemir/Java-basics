package JAVA_basic;

import OOP_exercises.main;
import Polimorphizm.Button;
import Polimorphizm.Password;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        double firstValue;
//        double secondValue;
//        String calculation;
//
//        System.out.println("Welcome to calculator! Please enter your first value:");
//        firstValue = in.nextDouble();
//        System.out.println("please enter your calculation:");
//        calculation = in.next();
//        boolean isValidCalculationSymbol = calculation.equals("+") || calculation.equals("-") || calculation.equals("*") || calculation.equals("/");
//
//        while (!isValidCalculationSymbol) {
//            System.out.println("please enter + - * / ");
//            calculation = in.next();
//            isValidCalculationSymbol = calculation.equals("+") || calculation.equals("-") || calculation.equals("*") || calculation.equals("/");
//
//        }
//
//        System.out.println("Please enter your second value:");
//        secondValue = in.nextDouble();
//
//        if (calculation.equals("+")) {
//            firstValue += secondValue;
//        } else if (calculation.equals("-")) {
//            firstValue -= secondValue;
//        }
//        System.out.println("The result is:" + firstValue);
//        int numbers = JAVA_basic.johnBriceCourse.math(3,5);

    }

    //        public static String myFullName() {
//            String fullName = "Haim Nemirovsky";
//            return fullName;
//

    /**
     * This method take two numbers and return the even number between them.
     *
     * @param theLowestNumber  of the serial(int).
     * @param theHighestNumber of the serial(int).
     * @param countEvens       is the even number in the serial(max: the highest number/2).
     * @return
     */
    public static int evenNumbers(int theLowestNumber, int theHighestNumber, int countEvens) {
        int[] theEvensNumbers = new int[theHighestNumber / 2];
        int count = 0;
        for (int i = theLowestNumber; i < theHighestNumber + 1; i++) {
            if (i % 2 == 0) {
                theEvensNumbers[count] = i;
                count++;
            }
        }
        return theEvensNumbers[countEvens];
    }

    public static String f3() {
        String f3 = "f3";
        System.out.println(f3);
        return f3;
    }

    public static String f2() {
        String f2 = "f2";
        System.out.println(f2);
        f3();
        return f2;
    }

    public static String f1() {
        String f1 = "f1";
        System.out.println(f1);
        f2();
        return f1;
    }

    /**
     * @return the correctDate
     */
    public static Date correctDate() {
        Date correctDate = new Date();
        return correctDate;
    }

    public static void print1toN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            print1toN(i);
        }
    }

    public static void printNto1(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printNto1(width);
        }
    }

    public static double aDouble(short sho1, short sho2, short sho3, short sho4, short sho5) {
        double average;
        average = (sho1 + sho2 + sho3 + sho4 + sho5) / 5.0;
        return average;
    }

    public static int rand(int min, int max) {
        Random random = new Random();
        int rand = random.nextInt(min, max + 1);
        return rand;
    }

    public static int maxInt(int inputNumber1, int inputNumber2, int inputNumber3) {
        int max = inputNumber1;
        if (max < inputNumber2) {
            max = inputNumber2;
        }
        if (max < inputNumber3) {
            max = inputNumber3;
        }
        return max;
    }

    public static void printArray (int[] bunchOfNumbers){
        for (int i = 0; i < bunchOfNumbers.length; i++) {
            System.out.println(bunchOfNumbers[i]);
        }
    }

    public static int[] intArray(int[]arr1){
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;
        }
        return arr1;
    }


}

