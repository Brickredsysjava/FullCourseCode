package FileHandling.FileInputStream;

import java.io.FileInputStream;

public class ReadingAllTheCharacters {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\piyush.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
