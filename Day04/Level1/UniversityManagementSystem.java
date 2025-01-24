// University Management System
import java.util.ArrayList;
import java.util.List;

// Course class
class Course{
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in course " + courseName);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teachCourse(Course course) {
        course.assignProfessor(this);
    }
}

// Student class
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }
}

// Main class to demonstrate the system
public class UniversityManagementSystem{
    public static void main(String[] args) {
        // Create courses
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Create professors
        Professor drSmith = new Professor("Dr. Smith");
        Professor drJohnson = new Professor("Dr. Johnson");

        // Assign professors to courses
        drSmith.teachCourse(math);
        drJohnson.teachCourse(physics);

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        // Enroll students in courses
        alice.enrollInCourse(math);
        bob.enrollInCourse(math);
        charlie.enrollInCourse(physics);

        // Display enrolled students
        math.showEnrolledStudents();
        physics.showEnrolledStudents();
    }
}
