package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInAFile {
    static FileWriter  writer;
    public static void main(String[] args)
    {
        try {
            FileWriter Writer
                    = new FileWriter("C:\\Users\\piyush\\IdeaProjects\\Demo\\src\\FileHandling\\piyush.txt");
            Writer.write(
                    "Files in Java are seriously good!!");
            Writer.write("This is the new world order");
            Writer.close();
            System.out.println("Successfully written.");

        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
