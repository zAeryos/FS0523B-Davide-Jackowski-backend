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

        // Exercise 2

        Scanner scanner = new Scanner(System.in);
        String[] strArray = new String[3];
        System.out.println("Insert first String: ");
        strArray[0] = scanner.nextLine();
        System.out.println("Insert second String: ");
        strArray[1] = scanner.nextLine();
        System.out.println("Insert third String: ");
        strArray[2] = scanner.nextLine();

        System.out.println("Strings concatenated: " + strArray[0] + ", " + strArray[1] + ", " + strArray[2]);
        System.out.println("Inverted Strings: " + strArray[2] + ", " + strArray[1] + ", " + strArray[0]);

        // Exercise 3

        double[] sides = new double[2];
        System.out.println("Insert x side length: ");
        sides[0] = scanner.nextDouble();
        System.out.println("Insert y side length: ");
        sides[1] = scanner.nextDouble();

        double perim1 = rectanglePerimeter(sides[0], sides[1]);
        System.out.println("The perimeter of the rectangle is :" + perim1);

        System.out.println("Choose a number to check whether it's even or odd: ");
        int inputNum = scanner.nextInt();
        oddOrEven(inputNum);

        scanner.close();

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

    // Exercise 3

    public static double rectanglePerimeter(double width, double height) {
        return width + height + width + height;
    }

    public static void oddOrEven(int num1) {
        if (num1 % 2 == 1) {
            System.out.println("The number " + num1 + " is odd.");
        } else if (num1 % 2 == 0 ) {
            System.out.println("The number " + num1 + " is even.");
        }
    }

    public static double trianglePerimeter(double s1, double s2, double s3) {
        return s1 + s2 + s3;
    }
}
