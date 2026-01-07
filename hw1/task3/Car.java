package hw1.task3;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Car o) {
        int speed = this.speed - o.speed;
        if (speed == 0) {
            int price = this.price - o.price;
            if (price == 0) {
                int model = this.model.compareTo(o.model);
                if (model == 0) {
                    return this.color.compareTo(o.color);
                } else {
                    return model;
                }
            } else {
                return price;
            }
        } else {
            return speed;
        }
    }
}