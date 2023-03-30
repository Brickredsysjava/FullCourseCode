package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingThrowChecked {
    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\Users\\piyush\\IdeaProjects\\Demo\\out\\production\\Demo\\ExceptionHandling\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);


        throw new FileNotFoundException(); //inline

    }


    //main method
    public static void main(String args[]){
        String location = "This is location/// //// // // ";
        /*try
        {
            method(location);
        }
        catch (FileNotFoundException e)
        {
            //System.out.println(e);
            e.printStackTrace();
        }*/
        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
