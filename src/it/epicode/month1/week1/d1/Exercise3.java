package it.epicode.month1.week1.d1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        // Exercise 3

        Scanner scanner = new Scanner(System.in);

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

    public static double triangleArea(double s1, double s2, double s3) {
        return s1 + s2 + s3;
    }
}

