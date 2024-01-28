package GetABlackBelt.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Borat", "Sagdyev", 10);
        Employee emp2 = new Employee(15, "Pamela", "Anderson", 100000);
        Employee emp3 = new Employee(123, "Azamat", "Bagatov", 8542);
        Employee emp4 = new Employee(123, "Azamat", "Zalupov", 9648);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sort \n" + list);
        Collections.sort(list, new SalaryComparator());
        System.out.println("After sort \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surName;
    int salary;

    public Employee(int id, String name, String surName, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if(this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
//        return Integer.compare(this.id, anotherEmp.id); //compare method
//        return this.id - anotherEmp.id; //short method
//        int result = this.name.compareTo(anotherEmp.name); //compare String to String
//        if(result == 0) {
//            result = this.surName.compareTo(anotherEmp.surName);
//        }
//        return result;
    }
}

//class IDComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        if(emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}