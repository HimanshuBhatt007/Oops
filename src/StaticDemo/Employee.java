package StaticDemo;

public class Employee {
    int empId;
    String name;
    static String companyName = "abc";

    Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }

    void display(){
        System.out.println("EmpId: "+empId+" Name: "+name+" CompanyName: "+companyName);
    }
}
