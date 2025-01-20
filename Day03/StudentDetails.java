class Student {
    // Static variable to store the name of the university (shared among all instances)
    public static String universityName = "Technocrats Groups";
    // Final instance variable to store the roll number (cannot be changed once assigned)
    private final String rollNumber;
    // Private instance variables to store the student's name and grade
    private String name;
    private char grade;
    // Static variable to keep track of the total number of students (shared among all instances)
    public static int totalStudent = 0;

    // Constructor to initialize the student's roll number, name, and grade
    public Student(String rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        // Increment the total number of students by 1 whenever a new student is created
        totalStudent += 1;
    }

    // Method to display the student details
    public void display() {
        System.out.println("Name of the Student: " + name);
        System.out.println("Roll Number of the Student: " + rollNumber);
        System.out.println("Grade of the Student: " + grade);
        System.out.println("Name of the Institute: " + universityName);
    }

    // Static method to display the total number of students
    public static void displayTotalStudent() {
        System.out.println("Total Number of Students: " + totalStudent);
    }
}

public class StudentDetails {
    public static void main(String args[]) {
        // Creating two instances of Student with different roll numbers, names, and grades
        Student student1 = new Student("0199AL211016", "Gagan Tantwar", 'A');
        Student student2 = new Student("0199AL211018", "Harhit Patel", 'B');

        // Checking if student1 is an instance of Student and displaying its details
        if (student1 instanceof Student) {
            student1.display();
        }
        System.out.println("\n");

        // Checking if student2 is an instance of Student and displaying its details
        if (student2 instanceof Student) {
            student2.display();
        }
        System.out.println("\n");

        // Calling the static method to display the total number of students
        Student.displayTotalStudent();
    }
}
