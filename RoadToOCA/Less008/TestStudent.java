package RoadToOCA.Less008;

public class TestStudent {
    String name;
    int course;
    static int counter;

    public TestStudent(String name, int course) {
        counter++;
        this.name = name;
        this.course = course;
        System.err.println("New student " + name + " is created! Student ID is " + counter);
    }

    public static void main(String[] args) {
        TestStudent student = new TestStudent("Borat", 1);
        TestStudent student1 = new TestStudent("Pamela", 2);
        TestStudent student2 = new TestStudent("Azamat", 3);
        TestStudent student3 = new TestStudent("Uruk", 3);

        System.out.println(student.name);
        System.out.println(counter);
    }
}
