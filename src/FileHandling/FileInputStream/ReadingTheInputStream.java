package FileHandling.FileInputStream;

import java.io.FileInputStream;

public class ReadingTheInputStream {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\piyush.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
