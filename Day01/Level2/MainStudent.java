import java.util.*;
class Student{
    private String name; // Name Variable
    private String rollNumber; // Roll Number Variable 
    private double marks; //Total marks varible
    private char grade; // grade varible;
    public Student(String name,String rollNumber,double marks){
        this.name=name; // Assigning name from user to name of class
        this.rollNumber=rollNumber; // assigning rollNumber from user to rollNumber of class
        this.marks=marks; // Assigning marks from user to marks of student
    }
    public void calculateGrade(double marks,int subjects){
        double average=(marks/(double)subjects);
        if(average>=80){ // grade is A if average is greater than 80;
            grade='A';
        }
        else if (average>=70){ // grade is B if average is greater than 70;
            grade='B';
        }
        else if(average>=60){ // grade is C if average is greater than 60;
            grade='C';
        }
        else if(average>=50){ //grade is D if average is greater than 50
            grade='D';
        }
        else if(average>=40){ // grade is C if average is greater than 40;
            grade='E';
        }
        else{
            grade='F';  // grade is F if average is less than 40
        }
    }
    public void displayDetails(){ // display function for displaying details
        System.out.println("Name of the Student: "+name); 
        System.out.println("Roll Number of the Student: "+rollNumber);
        System.out.println("Marks of Student: "+marks);
        System.out.println("Grade of Student :"+grade);
    }
    
}
public class MainStudent{
    public static void main(String args[]){
        // creating object of scanner class for taking input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Student: ");
        // Entering Name form user end
        String name=sc.nextLine();
        System.out.println("Enter Roll Number of the Student: ");
         // Entering Roll NUmber form user end
        String rollNumber=sc.next();
         // Entering number  of subject from user end
        System.out.println("Enter Subjects Of Student :");
        int subjects=sc.nextInt();
        // Entering total marks from user end
        System.out.println("Enter Total Marks of Student: ");
        double marks=sc.nextDouble();
        // Creating Object of Student class 
        Student student=new Student(name,rollNumber,marks);
        student.calculateGrade(marks,subjects);
        student.displayDetails();
        // Closing Scanner class object
        sc.close();
    }
}