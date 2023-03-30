package ExceptionHandling.UserDefinedException;

public class SquareRootException extends Exception{
    public static void sqrtException(int n) throws ArithmeticException{
        if(n<0){
            throw new ArithmeticException("Please provide positive number");
        }
        else {
            System.out.println("This is valid");
            System.out.println(n*n);
        }
    }
}
