package it.epicode.month1.week1.d2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a word to check if the strings length is odd or even");
        String word = scanner.next();
        System.out.println(stringOddEven((word)));

        System.out.println("Choose a year to check whether it's a leap year");
        int year = scanner.nextInt();
        System.out.println(leapYear(year));

    }

    public static boolean stringOddEven(String str) {
        if (str.length() % 2 == 0) {
            System.out.println("The words length is even");
            return true;
        } else{
            System.out.println("The words length is odd");
            return false;
        }
    }

    public static boolean leapYear(int year) {

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year");
            return true;
        } else {
            System.out.println("The year " + year + " is not a leap year");
            return false;
        }
    }
}
