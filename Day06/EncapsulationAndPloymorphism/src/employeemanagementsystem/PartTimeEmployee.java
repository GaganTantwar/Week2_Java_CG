package employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {
    private int bonus;
    private int totalSalary=0;
    private String department;
    public PartTimeEmployee(String empName,String employeeId,int baseSalary,int bonus,String department){
        super(empName,employeeId,baseSalary);
        this.bonus=bonus;
        assignDepartment(department);
    }
    @Override public int calculateSalary(){
        totalSalary=baseSalary+bonus;
        return totalSalary;
    }


    @Override public void assignDepartment(String department){
        this.department=department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
    @Override  public void displayDetails(){
        super.displayDetails();
        System.out.println("Total Salary of the Employee: "+calculateSalary());
        System.out.println("Departement of the Employee: "+getDepartmentDetails());
    }
}
