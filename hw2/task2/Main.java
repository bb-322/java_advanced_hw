package hw2.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        List<String> inputWords = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 5; i > 0; i--) {
            System.out.println("enter word: ");
            inputWords.add(sc.nextLine());
        }

        System.out.println(doubleValues(inputWords));

    }

    static List<String> doubleValues(List<String> words) {
        List<String> doubleWords = new ArrayList<>();

        for (String word : words) {
            doubleWords.add(word);
            doubleWords.add(word);
        }

        return doubleWords;
    }
}
