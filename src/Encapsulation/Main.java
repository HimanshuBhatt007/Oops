package Encapsulation;

public class Main {

    public static void main(String args[]){

        Employee e = new Employee();
        System.out.println(e.getEmpId());
        e.setEmpId(101);
        System.out.println(e.getEmpId());
    }
}
