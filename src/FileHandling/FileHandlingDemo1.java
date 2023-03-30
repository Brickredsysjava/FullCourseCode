package FileHandling;

// Java Program to Illustrate FileReader class

// Importing class
import java.io.FileReader;

// Main class
// FileReaderExample
public class FileHandlingDemo1 {

    // Main driver method
    public static void main(String args[]) throws Exception
    {

        // Creating an object of FileReader class to
        // read content from file in local directory
        FileReader fr = new FileReader("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\piyush.txt");


        int i;

        //System.out.println(i);
        // Reads from the file
        System.out.println(fr.read());
        System.out.println("This is in file --------------------------");
        while ((i = fr.read()) != -1) {
            // Printing the content inside the file
            System.out.print((char)i);
        }

        // Closing the connections to
        // avoid memory space
        fr.close();
    }
}

