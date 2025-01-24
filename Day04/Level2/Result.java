import java.util.*;
class Student{
    private String studentName;
    private ArrayList<Subject> subjects;
    public Student(String studentName)
    {
        this.studentName=studentName;
        this.subjects=new ArrayList<>();

    }
    public String getName(){
        return studentName;
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public ArrayList<Subject> getSubject(){
        return subjects;
    }
     
}
class Subject{
    private String subjectName;
    private int marks;
    public Subject(String subjectName,int marks){
        this.subjectName=subjectName;
        this.marks=marks;
    }
    public String getName(){
        return subjectName;
    }
    public int getMarks(){
        return marks;
    }
    public void display(){
        System.out.println("Subject Name: "+subjectName);
        
    }
}
class GradeCalculator{
    private ArrayList<Student>students;
   
    private char grade;
    private double average;
    
    public GradeCalculator(){
        this.students=new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void calculateGrade(){
        for(Student student :students){
             int total=0;
             int count=0;
            ArrayList<Subject> subjects=student.getSubject();
            for(Subject subject:subjects){
                total+=subject.getMarks();
                count+=1;
            }
            average=total/count;
            if(average>=80){
               grade='A';
            }
            else if(average>=70){
               grade='B';
            }
            else if(average>=60){
               grade='C';
            }
            else if(average>=50){
               grade='D';
            }
            else if(average>=40){
               grade='E';
            }
            else{
               grade='F';
            }
            System.out.println("Grade of the Student: "+student.getName()+" Grade: "+grade);
           
        }
    }
    public void deleteStudent(){ //showing aggregation
        students.clear();
        System.out.println("All Students are deleted");
        
    }
}
public class Result{
    public static void main(String args[]){
        Student jhon=new Student("Jhon Snow");
        Subject mathsJhon=new Subject("Mathematics",98);
        Subject chemistryJhon=new Subject("Chemistry",97);
        Subject physicsJhon=new Subject("Physics",95);
        jhon.addSubject(mathsJhon);
        jhon.addSubject(chemistryJhon);
        jhon.addSubject(physicsJhon);
        Student jane=new Student("Jane Rohdes");
        Subject mathsJane=new Subject("Mathematics",59);
        Subject chemistryJane=new Subject("Chemistry",70);
        Subject physicsJane=new Subject("Physics",68);
        jane.addSubject(mathsJane);
        jane.addSubject(chemistryJane);
        jane.addSubject(physicsJane);
        GradeCalculator grade=new GradeCalculator();
        grade.addStudent(jhon);
        grade.addStudent(jane);
        grade.calculateGrade();
        grade.deleteStudent();
        mathsJane.display();

    }
} 