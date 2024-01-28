package RoadToOCA.Less008;

public class TestCar {
    String color;
    String engine;
}

class Human {
    String name = "Borat";
    TestCar car = new TestCar();

    public static void main(String[] args) {
        Human human = new Human();
        human.car = new TestCar();
        human.car = new TestCar();
        human.car.engine = "V12";
    }
}
