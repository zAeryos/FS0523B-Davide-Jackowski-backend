package it.epicode.month1.week2.d1.ex1;

import java.util.Random;

public class RandomNumbers {

    private int[] numbers;
    public RandomNumbers() {

        numbers         = new int[5];
        Random random   = new Random();

        for (int i = 0; numbers.length <= 5; i++) {
            int number =  random.nextInt(10) + 1;
            numbers[i] = number;
            System.out.println(number);
            System.out.println(numbers[i]);
        }
    }


}
