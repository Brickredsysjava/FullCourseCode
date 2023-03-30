package FileHandling.FileInputStream.Serialization.WithIsARelationShip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ISASerializable {
    public static void main(String[] args) {
        try{
            //Creating the object
            Student s1 =new Student(211,"ravi","Engineering",50000);
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\WithIsARelationShip\\hello.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
