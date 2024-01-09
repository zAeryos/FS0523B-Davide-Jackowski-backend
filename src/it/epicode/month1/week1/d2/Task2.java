package it.epicode.month1.week1.d2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 0 and 3.");
        int num = scanner.nextInt();
        switchTask(num);

        System.out.println("Choose a number to countdown from: ");
        int num1 = scanner.nextInt();
        countdown(num1);

        System.out.println("inserisci una parola");
        String word = scanner.next();
        while (!word.equals(":q")) {
            divideWord(word);
            System.out.println("inserisci una parola");
            word = scanner.next();

        }
    }

    public static void switchTask(int num) {
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("You must choose a number between 0 and 3");
                break;
        }
    }

    public static void divideWord(String word) {

        String[] wordArr = word.split("");
        System.out.println(String.join(",", wordArr));
    }
    public static void countdown (int num) {
        int chosenNum = num;

        for (int i = 0; i <= num; i++) {
            System.out.println(chosenNum);
            chosenNum--;
        }
    }

}
