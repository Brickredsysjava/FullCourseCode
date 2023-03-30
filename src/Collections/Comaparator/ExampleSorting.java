package Collections.Comaparator;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleSorting {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Raghu");
        s.add("Inti");
        s.add("Piyush");
        System.out.println("Before Sorting");
        System.out.println(s);
        System.out.println("After sorting");
        Collections.sort(s);
        System.out.println(s);
    }
}
