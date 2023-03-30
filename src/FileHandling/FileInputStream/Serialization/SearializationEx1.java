package FileHandling.FileInputStream.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SearializationEx1 {
    public static void main(String[] args) {

        try{
            //Creating the object
            Student s1 =new Student(211,"ravi");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }
        catch(Exception e)
        {System.out.println(e);}

    }

}
