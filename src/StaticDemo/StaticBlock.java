package StaticDemo;

public class StaticBlock {

    static {
        System.out.println("Hello World of Static Block");
       // System.exit(0);
    }

    public static void main(String args[]){
        System.out.println("In Main Method");
    }
    static{
        System.out.println("in second static block");
    }
}
