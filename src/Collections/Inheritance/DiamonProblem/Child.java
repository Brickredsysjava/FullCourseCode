package Collections.Inheritance.DiamonProblem;

import Collections.Inheritance.ChildA;

public class Child implements A, B{

    @Override
    public void printA() {
        A.super.printA();
        B.super.printA();
        System.out.println("This is in Child");
    }

    public static void main(String[] args) {
        Child n = new Child();
        n.printA();
    }
}
