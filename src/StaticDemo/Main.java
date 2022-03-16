package StaticDemo;

public class Main {
    public static void main(String args[]){

        System.out.println(Test.a); // static variable can be directly accessed through class

        Employee e1 = new Employee(101, "Amit");
        e1.display();
        Employee e2 = new Employee(102, "Himanshu");
        e2.display();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);
        Test.display();

        StaticBlock sb = new StaticBlock();


    }
}
