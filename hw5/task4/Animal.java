package hw5.task4;

public class Animal {
    public boolean exists;
    protected String name;
    private int age;

    public Animal(String name, int age, boolean exists) {
        this.name = name;
        this.age = age;
        this.exists = exists;
    }
}
