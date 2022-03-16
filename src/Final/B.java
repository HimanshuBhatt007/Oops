package Final;

public class B {
    final int a = 10; // Final variables cannot be changed
    int b = 20;
    final String str = "Himanshu";
    String str1 = "Hello";

    final void display(){ // Final method cannot be overridden
        System.out.println("Hello World");
    }
}
