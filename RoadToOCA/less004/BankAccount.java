package RoadToOCA.less004;

public class BankAccount {
    int id;
    String name;
    double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "pidor", 12.1);
        BankAccount bankAccount1 = new BankAccount(2, "chert", 24.68);
        BankAccount bankAccount2 = new BankAccount(3, "zalupa", 999.666);
        BankAccount bankAccount3 = bankAccount; //тест референтной ссылки

        System.out.println("Имя первого шайтана " + bankAccount.name + " баланс " + bankAccount.balance);
        System.out.println("Второго зовут " + bankAccount1.name + " баланс " + bankAccount1.balance);
        System.out.println("Третий пиздюк " + bankAccount2.name + " баланс " + bankAccount2.balance);
        System.out.println("Четвертый " + bankAccount3.name + " баланс " + bankAccount3.balance);
    }
}