package hw2.task5;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<>();
        String word;

        while (true) {
            System.out.print("enter word: ");
            word = sc.nextLine();

            if (word.equals("end")){
                break;
            } else {
                words.add(word);
            }
        }

        for (String s : words) {
            System.out.println(s);
        }
    }
}
