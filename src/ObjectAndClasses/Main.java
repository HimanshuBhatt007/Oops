package ObjectAndClasses;

public class Main {
    public static void main(String args[]){
        System.out.println("1");
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
        Animal suzo = new Animal();
        suzo.run();
        suzo.eat();

        buzo.age = 10;
        buzo.color = "Black";

        //System.out.println(buzo.age+" "+buzo.color);
        buzo.init(10, "Black");
        buzo.display();


        Birds bella = new Birds();
        bella.fly();
    }
}
