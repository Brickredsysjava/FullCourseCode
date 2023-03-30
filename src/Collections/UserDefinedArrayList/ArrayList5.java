package Collections.UserDefinedArrayList;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ArrayList5 {
    public static void main(String args[]) {

        Adress a = new Adress("noida", "punjab", "vanarasi");
        Adress b = new Adress("noida", "punjab", "vanarasi");
        Adress c = new Adress("noida", "punjab", "vanarasi");
        Home h = new Home("noida", "punjab", "banaras", 1234);
        List<Adress> l = new ArrayList<>();
         //Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23, asList("Math", "English", "Science"), a);
        Student s2 = new Student(102, "Ravi", 21, asList("Economics", "Political", "Grammar"), b);
        Student s3 = new Student(103, "Hanumat", 25, asList("Computer Networks", "DSA", "Graphics"), c);
        //creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr = al.iterator();
        //Student s = new Student();
        //traversing elements of ArrayList object
        while (itr.hasNext()) {
            Student st = (Student) itr.next(); // This is typecasting of Student data type over iterator
            System.out.println(st.rollno + " " + st.name + " " + st.age + " " + st.subjects + " Current " + st.addresses.current + "Pankaj  " + st.addresses.PankajKiNaniKaGhar + " Permanent " + st.addresses.Permanent );
            //System.out.println(itr.next());
            //s = (Student) itr.next();
            //System.out.println(s);
        }

    }
}