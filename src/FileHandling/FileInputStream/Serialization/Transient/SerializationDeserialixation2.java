package FileHandling.FileInputStream.Serialization.Transient;

import java.io.*;

public class SerializationDeserialixation2 {
    public static void main(String[] args) throws IOException {
        UnivStudent s1 =new UnivStudent(311,"Piyush",23);//creating object
        //writing object into file
        FileOutputStream f=new FileOutputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\Transient\\Univ.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
        System.out.println("success");
        System.out.println("Deserialization start ===========");
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\FileInputStream\\Serialization\\Transient\\Univ.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            UnivStudent e = (UnivStudent) in.readObject();

            System.out.println("My name is " + e.name + " and the age is " + e.age + " And the id is " + e.id);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
