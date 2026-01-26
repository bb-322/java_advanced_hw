package hw5.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    static void main() {
        try {
            Class<?> cls = Class.forName("hw5.task3.Car");

            System.out.println(cls.getName());
            System.out.println(cls.getPackageName());
            System.out.println(Modifier.toString(cls.getModifiers()));

            for (Field f : cls.getDeclaredFields()) {
                System.out.println(
                        Modifier.toString(f.getModifiers()) + " " +
                                f.getType().getSimpleName() + " " +
                                f.getName()
                );
            }

            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getSimpleName() + " " +
                                m.getName()
                );
            }

            for (Constructor<?> c : cls.getDeclaredConstructors()) {
                System.out.println(
                        Modifier.toString(c.getModifiers()) + " " +
                                c.getName()
                );
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
