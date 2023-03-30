package ExceptionHandling;

public class WorthlessException {

    public static void method() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        method();
    }
}
