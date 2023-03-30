package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapDemo1 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1, "Hello world");
        h.put(2, "This is world");
        h.put(1, "This is me");

        System.out.println(h);

        HashMap<Integer, Person> h2 = new HashMap<>();

        Person p = new Person(22, "Parth", "Electrical");
        Person p2 = new Person(22, "Kabir", "CS");
        Person p3 = new Person(23, "Sahil", "Mech");

        h2.put(1, p);
        h2.put(2, p2);
        h2.put(3, p3);

        System.out.println(h2);

        Iterator hmIterator = h2.entrySet().iterator();

        while (hmIterator.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry)hmIterator.next();

            Person p1 = (Person) hmIterator;
            // Printing mark corresponding to string entries
            System.out.println("This is the value at this key Number" + mapElement.getKey() + "Age of" + p1.name + p1.age + p1.stream);
        }
    }
}
