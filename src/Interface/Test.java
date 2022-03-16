package Interface;

public class Test implements I1, I2{ // This is multiple inheritance.

    public void show(){
        System.out.println("Overriding show method");
    }

    public void display(){
        System.out.println("Overriding display method");
    }

}
