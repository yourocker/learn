package GetABlackBelt.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("Pidr");
//        list.add(5);
//        list.add(new StringBuilder("Hey"));
//        list.add(new Car());
        list.add("Hello");
        list.add("Good bye");
        list.add("Pidr");

        for(Object o : list) {
            System.out.println(o + " length " + ((String)o).length());
        }
    }
}