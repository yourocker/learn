package GetABlackBelt.Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        System.out.println(info1.getValue());

        Info<Integer> info2 = new Info<>(666);
        System.out.println(info2);
        System.out.println(info2.getValue());
    }
}

class Info <T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
