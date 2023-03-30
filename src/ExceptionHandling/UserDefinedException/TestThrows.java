package ExceptionHandling.UserDefinedException;

public class TestThrows {
    public static void main(String args[])
    {
        SquareRootException.sqrtException(-1);
        /*try
        {
            // throw an object of user defined exception
            SquareRootException.sqrtException(5);
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the exception");//code flow
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
        */
    }
}
