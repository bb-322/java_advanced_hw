package hw5.task3;

public class Car {
    protected int price, maxSpeed;
    protected String manufacturer;

    public Car(int price, int maxSpeed, String manufacturer) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.manufacturer = manufacturer;
    }

    protected void driveMaxSpeed() {
        System.out.println("car drives at " + maxSpeed + " km/h");
    }

    protected void buyCar() {
        System.out.println(manufacturer + " car is bought with $" + price);
    }

}
