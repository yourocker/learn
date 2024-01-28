package RoadToOCA.less005;

public class Test {
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int avg(int a1, int b1, int c1) {
        return sum(a1 , b1, c1) / 3;
    }
}

class Test1 {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sum(2, 4, 6));
        System.out.println(test.avg(2, 4, 6));
    }
}
