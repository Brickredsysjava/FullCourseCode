package Collections.Abstraction;

public class Inheritance1Implementation implements Inheritance1{

//
//
    public void kabir() {
        Inheritance1.super.kabir();
        System.out.println("Yes I am very intelligent");
    }

    public static void main(String[] args) {
        Inheritance1Implementation I = new Inheritance1Implementation();
        I.kabir();
    }
}
