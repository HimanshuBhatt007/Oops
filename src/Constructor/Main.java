package Constructor;

public class Main {
    public static void main(String[] args){

        Test t = new Test();
        System.out.println(t.i+" "+t.s);

        Test t1 = new Test(10);
        System.out.println(t1.i);

        Employee e1 = new Employee("Himanshu", 101);
        Employee e2 = new Employee("Himani", 102);

        System.out.println("Employee 1 "+e1.name+" "+e1.employeeID);
        System.out.println("Employee 2 "+e2.name+" "+e2.employeeID);
    }
}
