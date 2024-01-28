package RoadToOCA.less005;

public class Human {
    String name;
    Car3 car;
    BankAccount bankAccount;

    void info() {
        System.out.println(name + " " + car.color + " " + bankAccount.balance);
    }
}

class Car3 {
    String color;
    String engine;

    public Car3(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class BankAccount {
    int id;
    double balance;

    public BankAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    void popolnenieScheta(double sum) {
        balance += sum;
        System.out.println("Баланс пополнен на сумму " + sum + " текущий баланс " + balance);
    }

    void snyatieSoScheta(double sum) {
        balance -= sum;
        System.out.println("Произошло списание на сумму " + sum + " текущий баланс " + balance);
    }
}

class HumanTest {

    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Pes";
        human.car = new Car3("yellow", "V12");
        human.bankAccount = new BankAccount(123, 200);
        human.info();
        human.bankAccount.popolnenieScheta(120.2);
        human.bankAccount.snyatieSoScheta(48.50);
        human.info();
    }
}
