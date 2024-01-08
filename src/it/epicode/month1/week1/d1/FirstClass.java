package it.epicode.month1.week1.d1;

import java.io.Console;
import java.util.Scanner;

public class FirstClass {


    public static void main(String[] args){

        // Exercise 1

        int multiplySum = multiply(6, 10);
        System.out.println("The sum of the numbers is: " + multiplySum);

        String concatResult = concat("Hello, world ", 15);
        System.out.println("The method will show: " + concatResult);

        System.out.println("Test");

    }

    // Exercise 1
    public static int multiply(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }

    public static String concat(String str, double num) {
        return str + num;
    }

//    public static String[] addToArray() {
//        Scanner scanner = new Scanner(System.in);
//        String[] strArray = new String[5];
//
//        for(int i = 0; i < strArray.length; i++) {
//            System.out.println("Choose string to add to array");
//            strArray[i] = scanner.nextString();
//        }
//
//        return strArray;
//    }


}
