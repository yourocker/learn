package RoadToOCA.less006;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");
    }

    void show(String s, int a) {
        System.out.println(s + " " + a);
        System.out.println("Double parameters");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        int a = 500;
        methodOverloading.show(a);
        boolean b =true;
        methodOverloading.show(b);
        String s = "zalupa";
        methodOverloading.show(s);
        methodOverloading.show("Pidor", 2);
    }
}