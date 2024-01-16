package it.epicode.month1.week2.d2.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNums {

    public static void main(String[] args) {

        List<Integer> randomNums = getRandomNums(10);

        System.out.println("The random numbers are: " + randomNums);

        List<Integer> invertedNums = reverseListNumbers(randomNums);

        System.out.println("The inverted numbers are: " + invertedNums);

        printOddAndEvenNums(randomNums, false);

    }

    public static List<Integer> getRandomNums (int n) {
        List<Integer> randomNums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            randomNums.add((int) (Math.random() * 100) + 1);
        }
        Collections.sort(randomNums);
        return randomNums;
    }

    public static List<Integer> reverseListNumbers (List<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>(numbers);
        Collections.reverse(reversedNumbers);
        return reversedNumbers;
    }

    public static void printOddAndEvenNums(List<Integer> numbers, boolean bool) {
        if (bool == true) {
            System.out.print("The even numbers are: ");
            for (int number:numbers) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
        } else if (bool == false) {
            System.out.print("The odd numbers are: ");
            for (int number:numbers) {
                if (number % 2 == 1) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
