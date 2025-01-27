package employeemanagementsystem;

public abstract class Employee {
    protected String empName;
    protected String employeeId;
    protected int baseSalary;
    public Employee(String empName,String employeeId,int baseSalary){
        this.empName=empName;
        this.employeeId=employeeId;
        this.baseSalary=baseSalary;
    }
    public abstract int calculateSalary();
    public void displayDetails(){
        System.out.println("Name of the Employee: "+empName);
        System.out.println("Id of the Employee: "+employeeId);
        System.out.println("Base Salary of the Employee: "+baseSalary);
    }
}
