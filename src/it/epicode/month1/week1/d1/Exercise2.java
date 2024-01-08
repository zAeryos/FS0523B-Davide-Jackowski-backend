package it.epicode.month1.week1.d1;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){

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
        System.out.println("Inverted Strings concatenated: " + strArray[2] + ", " + strArray[1] + ", " + strArray[0]);

    }
}
