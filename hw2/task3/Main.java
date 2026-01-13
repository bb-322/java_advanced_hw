package hw2.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        List<Integer> numbers = getIntegerList(n, sc);
        int minNumber = getMinimum(numbers);

        System.out.println(minNumber);

    }

    static List<Integer> getIntegerList(int n, Scanner sc) {
        List<Integer> numbers = new LinkedList<>();

        System.out.println("enter " + n + " numbers: ");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        return numbers;
    }

    static int getMinimum(List<Integer> numbers) {
        int min = numbers.getFirst();
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
