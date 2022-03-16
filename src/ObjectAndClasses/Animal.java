package ObjectAndClasses;

    class Animal {
    int age;
    String color;

    void init(int a, String c){
        age = a;
        color = c;
    }

    void display(){
        System.out.println(age+" "+color);
    }

    public void eat(){
        System.out.println("Animal is Eating");
    }

    public void run(){
        System.out.println("Animal is running");
    }
}
