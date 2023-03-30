public class switchcase {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int age=20;

        boolean flag = true;
        //Switch expression
        switch(age){
            //Case statements
            case 18:
                break;
            case 19:
                break;
            case 20: System.out.println("You are eligibile to participate in the given quiz");
                        break;

            //Default case statement
            default:System.out.println("You are not eligible");
        }

        /*switch(in){
            //Case statements
            case "":
                String in = "Piyush";

            case 20: System.out.println("20");

            case 30: System.out.println("30");

                //Default case statement
            default:System.out.println("Not in 10, 20 or 30");*/
        }

        /*switch (flag){
            case true: System.out.println("true statement");
            case false: System.out.println("false flag");
        }*/
    }

