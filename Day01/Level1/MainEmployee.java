import java.util.*; // Importing the Scanner class for user input

// Class representing an employee
class Employee {
    private String name; // Name of the employee
    private int id; // ID of the employee
    private int salary; // Salary of the employee

    // Constructor to initialize the employee
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name Of Employee: " + name);
        System.out.println("ID Of Employee: " + id);
        System.out.println("Salary Of Employee: " + salary);
    }
}

// Main class to interact with the Employee class
public class MainEmployee{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting user for employee details
        System.out.println("Enter Name Of Employee: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter ID Of Employee: ");
        int employeeId = sc.nextInt();
        System.out.println("Enter Salary Of Employee: ");
        int employeeSalary = sc.nextInt();

        // Creating an Employee object with user-provided details
        Employee emp = new Employee(employeeName, employeeId, employeeSalary);

        // Displaying employee details
        emp.displayDetails();

        sc.close(); // Closing the Scanner object
    }
}
