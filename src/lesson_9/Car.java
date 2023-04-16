package lesson_9;

public class Car {
    int a;
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;

    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "V8");


        System.out.println(c1.color);
    }
}
