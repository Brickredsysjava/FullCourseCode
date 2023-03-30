package Collections.Comaparator;

import Collections.HashMap.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo1 {
    public static void main(String[] args) {

        ArrayList<Student> h1 = new ArrayList<>();
         Student p = new Student(22, "Parth", "Electrical");
        Student p2 = new Student(22, "Kabir", "CS");
        Student p3 = new Student(23, "Sahil", "Mech");

        h1.add(p);
        h1.add(p2);
        h1.add(p3);
        Collections.sort(h1);

    }
}
