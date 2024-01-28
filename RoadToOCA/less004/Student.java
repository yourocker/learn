package RoadToOCA.less004;

public class Student {
    int ticketNumber;
    String name;
    String secondName;
    int yearOfEducation;

    double mathAverage;
    double economicsAverage;
    double languageAverage;

    public Student(int ticketNumber, String name, String secondName, int yearOfEducation, double mathAverage, double economicsAverage, double languageAverage) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.secondName = secondName;
        this.yearOfEducation = yearOfEducation;
        this.mathAverage = mathAverage;
        this.economicsAverage = economicsAverage;
        this.languageAverage = languageAverage;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1001, "Vasya", "Petrov", 1991, 4.1, 3, 5);
        Student student1 = new Student(1002, "Petya", "Vasilyev", 1992, 3.5, 4.9, 4.6);
        Student student2 = new Student(1003, "Sanya", "Ivanov", 1990, 3.2, 3.3, 4.5);

        double mathAvg = (student.mathAverage + student1.mathAverage + student2.mathAverage) / 3;
        double econAvg = (student.economicsAverage + student1.economicsAverage + student2.economicsAverage) / 3;
        double langAvg = (student.languageAverage + student1.languageAverage + student2.languageAverage) / 3;

        System.out.println("math avg = " + mathAvg + " econ avg = " + econAvg + " lang avg = " + langAvg);
    }
}
