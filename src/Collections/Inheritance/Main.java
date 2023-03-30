package Collections.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Parent p = new ChildA();
        Parent p = new ChildA(); // upcast
        //ChildA c2 = (ChildA) new Parent();
        //ChildA c = new ChildA();
        //c.print();
        //c2.print();
        p.print();
    }
}
