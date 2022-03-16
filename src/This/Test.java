package This;

public class Test {
    int i;

    void setValue(int i){
       // i = i;
        this.i = i;
    }
    void show(){
        display(); // display(); = this.display(); , This keyword can be used to invoke current class method
        System.out.println(i);
    }

    void display(){
        System.out.println("Hello");
    }
}
