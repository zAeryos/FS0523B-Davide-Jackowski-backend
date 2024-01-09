package it.epicode.month1.week1.d1;

import java.io.Console;
import java.util.Arrays;

public class FirstClass {


    public static void main(String[] args){

        // Exercise 1

        int multiplySum = multiply(6, 10);
        System.out.println("The sum of the numbers is: " + multiplySum);

        String concatResult = concat("Hello, world ", 15);
        System.out.println("The method will show: " + concatResult);


        String[] arr = insertIntoArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");

        System.out.println(Arrays.toString(arr));

    }

    // Exercise 1
    public static int multiply(int num1, int num2){
        int sum = num1 * num2;
        return sum;
    }

    public static String concat(String str, double num) {
        return str + num;
    }

    public static String[] insertIntoArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }

}
