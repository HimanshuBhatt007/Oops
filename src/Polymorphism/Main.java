package Polymorphism;

public class Main {
    public static void main(String args[]){

        CTPolymorphism t = new CTPolymorphism();
        t.show();
        t.show(10);
        t.show(10, "Himanshu");
        t.show("Himanshu", 10);
        t.show('a');
        t.show(new StringBuffer("Himanshu"));
        t.show(10, 10, 10);

        RTPolymorphism test = new RTPolymorphism();
        test.show();
        RTPolymorphism1 test1 = new RTPolymorphism1();
        test1.show();

    }
}
