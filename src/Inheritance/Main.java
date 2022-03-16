package Inheritance;

public class Main {
    public static void main(String args[]){
        A objA = new A();
        objA.showA();
        System.out.println("----------------");
        B objB = new B();
        objB.showA();
        objB.showA();
        System.out.println("-----------------");
        C objC = new C();
        objC.showA();
        objC.showB();
        objC.showC();
        System.out.println("-----------------");
        D objD = new D();
        objD.showA();
        objD.showD();
    }
}
