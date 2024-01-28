package RoadToOCA.less004;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = car;
        car1.color = "black";
        car1.engine = "V8";

        System.out.println(car.color + " " + car.engine);
        System.out.println(car1.color + " " + car.engine);
        System.out.println(new Car().color);
    }
}
