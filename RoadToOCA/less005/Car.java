package RoadToOCA.less005;

public class Car {
    String color;
    String engine;
    int speed;

    public Car(String color, String engine, int speed) {
        this.color = color;
        this.engine = engine;
        this.speed = speed;
        System.out.println("car is created");
    }

    int speedUp(int speedy) {
        return speed += speedy;
    }

    void showInfo() {
        System.out.println(color + " " + engine + " " + speed);
    }
}

class CarTest {
    static Car car = new Car("red", "V6", 200);

    public static void main(String[] args) {
        car.speedUp(150);
        System.out.println(car.speed);
        car.showInfo();
    }
}
