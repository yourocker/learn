package RoadToOCA.Less008;

public class TestConstant {
    public final int a;

    TestConstant() {
        a = 20;
    }

    TestConstant(boolean b) {
        a = 50;
    }

    public static void main(String[] args) {
        TestConstant test = new TestConstant();
        System.out.println(test.a);

        TestConstant testBool = new TestConstant(true);
        System.out.println(testBool.a);
    }
}