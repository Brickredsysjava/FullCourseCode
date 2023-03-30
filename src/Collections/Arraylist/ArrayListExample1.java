package Collections.Arraylist;

import java.util.*;
public class ArrayListExample1{
    public static void main(String args[]){
        ArrayList<String> list= new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Shelby");
        //Printing the arraylist object
        System.out.println(list);
        System.out.println(list.get(3));
        //System.out.println(Arrays.toString(list.toArray()));
        list.remove("Apple");
        System.out.println("After removal");
        System.out.println(list);
        list.add(2, "Apple");
        System.out.println("After insertion");
        System.out.println(list);
        System.out.println("Lets insert some fruit in cart");
        Scanner sc = new Scanner(System.in);
        String newFruit = sc.next();
        list.add(newFruit);
        System.out.println("This is after user input");
        System.out.println(list);
    }

}