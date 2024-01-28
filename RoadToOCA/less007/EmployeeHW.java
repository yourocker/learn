package RoadToOCA.less007;

public class EmployeeHW {
    int id;
    private double salary;
    public String surname;

    public EmployeeHW(int id, double salary, String surname) {
        this.id = id;
        this.salary = salary;
        this.surname = surname;
    }

    void showID() {
        System.out.println(id);
    }

    void showSalary() {
        System.out.println(salary);
    }

    void showSurname() {
        System.out.println(surname);
    }
}

class EmployeeHWTest {
    public static void main(String[] args) {
        EmployeeHW employeeHW = new EmployeeHW(1, 123.2, "sobaka");
        employeeHW.showID();
        employeeHW.showSalary();
        employeeHW.showSurname();
    }
}
