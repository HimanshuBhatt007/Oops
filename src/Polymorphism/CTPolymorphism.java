package Polymorphism;

public class CTPolymorphism { // Compile Time Polymorphism is achieved by method overloading(same method name with different arguments)

    void show(){
        System.out.println("Method with no argument called");
    }
    void show(int a){
        System.out.println("Method with argument integer called :"+a);
    }
    void show(String a){
        System.out.println("Method with argument string called :"+a);
    }
    void show(int a, String b){
        System.out.println("Method with arguments integer and string called :"+a+" "+b);
    }
    void show(String a, int b){
        System.out.println("Method with arguments String and integer called :"+a+" "+b);
    }
    void show(Object a){
        System.out.println("Method with argument Object called :"+a);
    }
    void show(StringBuffer a){
        System.out.println("Method with argument StringBuffer called :"+a);
    }
    void show(int... a){
        System.out.println("Method with variable arguments called ");
    }

}
