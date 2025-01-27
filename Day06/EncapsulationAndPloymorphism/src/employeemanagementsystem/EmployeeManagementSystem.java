package employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String args[]){
        Employee jhon=new FullTimeEmployee("Jhon Clark","EMPID524",50000,2500,1500,5000,"Developer");
        Employee jane=new PartTimeEmployee("Jane Smith","EMPID214",40000,2000,"Marketing");
        jhon.displayDetails();
        System.out.println(" ");
        jane.displayDetails();
        System.out.println(" ");




    }
}
