package it.epicode.month1.week2.d2.ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> words           = new HashSet<String>();
        Set<String> duplicateWords  = new HashSet<String>();
        Set<String> uniqueWords     = new HashSet<String>();

        System.out.println("Choose how many words to add.");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert a word");
            String word = scanner.nextLine();
            if (words.add(word)) {
                System.out.println("You added the word: " + word);
                uniqueWords.add(word);
            } else if (!words.add(word)) {
                System.out.println("The word '" + word + "' already exists, adding to the duplicate list.");
                uniqueWords.remove(word);
                duplicateWords.add(word);
            }
            System.out.println();
        }

        System.out.println("The duplicate list is: " + duplicateWords);
        System.out.println("Number of unique words: " + uniqueWords.size());
        System.out.println("The unique list is: " + uniqueWords);
        System.out.println("The list of all words is: " + words);

    }





}
