package hw1.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Green");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(200, 8000, "BMW", "Black");
        Car c5 = new Car(210, 3000, "Audi", "Black");
        Car c6 = new Car(185, 9000, "Audi", "White");
        Car[] c = {c1, c2, c3, c4, c5, c6};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
