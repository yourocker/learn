package RoadToOCA.less007;

public class Employee {
    private double salary;

    private void salaryUpdate() {
        salary *= 2;
        System.out.println("new salary = " + salary);
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.salaryUpdate();
    }
}

class EmployeeTest {

//    public static void main(String[] args) {
//        Employee employee = new Employee(250);
//        System.out.println(employee.salary);
//        employee.salaryUpdate();
//    }
}