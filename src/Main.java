public class Main {

    static int z=10;
    public static void main(String[] args) {
        //BYOB.x = 22;
        System.out.println("Hello world!" + " " + BYOB.x);
        BYOB s = new BYOB();
        /*boolean y = true;
        boolean x = false;
        if(x&y){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }*/
        int a=1,b=0;

        System.out.println(a); //10
        System.out.println(a++);//10 //post-increment => (print, increase)
//        ++a;
//        System.out.println(a!b);
        System.out.println(++a);//12
        System.out.println(a--);//12
        System.out.println(--a);//10
        System.out.println(a);//10
        int y = s.add(20,10);
        System.out.println(5<=10);
        System.out.println("this is y " + y);
        System.out.println("this is z " + Main.z);
    }
}