package hw5.task4;

import java.lang.reflect.Field;

public class Cat {
    static void main(String[] args) {
        Animal animal = new Animal("name", 5, true);

        try {
            Class<?> cls = Animal.class;

            Field existsField = cls.getField("exists");
            existsField.set(animal, false);

            Field nameField = cls.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(animal, "anotherName");

            Field ageField = cls.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(animal, 100);

            System.out.println(animal.exists);
            System.out.println(animal.name);
            System.out.println(ageField.get(animal));

        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
