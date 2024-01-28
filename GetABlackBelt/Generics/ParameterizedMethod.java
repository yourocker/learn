package GetABlackBelt.Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        System.out.println(GenMethod.getSecondElement(list));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Beer");
        list1.add("Vodka");
        list1.add("Entertainment");
        System.out.println(GenMethod.getSecondElement(list1));
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
