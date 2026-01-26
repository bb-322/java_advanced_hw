package hw5.task2;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter class name: ");
        String userC = sc.nextLine();

        try {
            Class<?> cls = Class.forName(userC);

            System.out.println(cls.getName());
            System.out.println(cls.getPackageName());

            for (Field f : cls.getDeclaredFields()) {
                System.out.println("Field: " + f.getName());
            }

            for (Method m : cls.getDeclaredMethods()) {
                System.out.println("Method: " + m.getName());
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
