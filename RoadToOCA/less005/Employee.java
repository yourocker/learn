package RoadToOCA.less005;

public class Employee {
    int id;
    int age;
    double salary;
    String surname;
    String department;

    public Employee(int id, int age, double salary, String surname, String department) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.surname = surname;
        this.department = department;
    }

    void salaryUp() {
        System.out.println("current salary is " + salary);
        salary *= 2;
        System.out.println("after upgrade current salary is " + salary);
    }
}

class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(001, 19, 23500.12, "Ivanov", "Terpila");
        Employee employee2 = new Employee(002, 23, 19321.10, "Petrov", "Terpila");

        employee1.salaryUp();
        employee2.salaryUp();
    }
}
