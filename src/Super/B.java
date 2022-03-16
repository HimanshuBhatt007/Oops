package Super;

public class B extends A{

    int i = 20;
    void show(int i){
        System.out.println(this.i);
        System.out.println(i);
        System.out.println(super.i);
        display();
        super.display();
    }

    public void display(){
        System.out.println("In class B");
    }

}
