package FileHandling.FileInputStream.Serialization.StaticDataMember;

import FileHandling.FileInputStream.Serialization.WithIsARelationShip.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaticDataMember {
    public static void main(String[] args) {
        try {
            Employee e = new Employee(101, "Piyush");
            FileOutputStream fout = new FileOutputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\StaticDataMember\\Employee1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }
        catch (Exception e ){
            System.out.println(e);
        }
            try{
                //Creating stream to read the object
                ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\StaticDataMember\\Employee1.txt"));
                Employee s=(Employee) in.readObject();
                //printing the data of the serialized object
                System.out.println(s.id+" "+s.name);
                //closing the stream
                in.close();
            }catch(Exception e){System.out.println(e);}

        }
    }
