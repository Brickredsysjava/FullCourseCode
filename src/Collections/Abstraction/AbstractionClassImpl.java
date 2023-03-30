package Collections.Abstraction;

public class AbstractionClassImpl extends AbstractionClass{

    @Override
    void kabir() {
        System.out.println("kabir is very much annoying");
    }

    @Override
    void mainHooJian() {
        //super.mainHooJian();
        System.out.println("Main hoon bahut bada ha_ami");
    }

    public static void main(String[] args) {
        AbstractionClassImpl abstractionClass = new AbstractionClassImpl();
        abstractionClass.kabir();
        abstractionClass.mainHooJian();
    }
}
