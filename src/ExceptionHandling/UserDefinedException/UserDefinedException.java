package ExceptionHandling.UserDefinedException;

public class UserDefinedException extends Exception{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str); // print here
    }
}
