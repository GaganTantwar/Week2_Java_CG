import java.util.*; // Importing the utility package for using ArrayList

class  Patient {
    private String  patientName; // Name of the  Patient
    private final String  patientId; // Roll number of the  PatientDoctors
    private  ArrayList< Doctor>  doctors; // List to store  doctors the  Patient is enrolled in

    // Constructor to initialize the  Patient's details
    public  Patient(String  patientName, String  patientId) {
        this.patientName =  patientName;
        this.patientId =  patientId;
        this.doctors = new ArrayList<>();
    }

    // Getter method to get the name of the  Patient
    public String getName() {
        return  patientName;
    }

    // Getter method to get the roll number of the  Patient
    public String getId() {
        return  patientId;
    }

    // Method to add a  Doctor to the  Patient's list of  doctors
    public void addDoctor(Doctor  doctor) {
         doctors.add( doctor);
         doctor.consult(this);
        System.out.println("New  Doctor Added");
    }

    // Method to display the  Patient's details and  doctors
    public void display() {
        System.out.println("Name of the  Patient: \"" +  patientName + "\" Id of the  Patient: \"" +  patientId + "\"");
        for ( Doctor  doctor :  doctors) {
            System.out.println(" Doctor Name: \"" +  doctor.getName() + "\"  Doctor Id of the  Doctor: \"" +  doctor.getId() + "\"  Doctor Charges: \"" +  doctor.getCharges() + "\"");
        }
    }
    public  ArrayList<Doctor> arrayList(){
        return doctors;
    }
}

 class  Doctor{
    private String  doctorName; // Name of the  Doctor
    private final String  doctorId; // ID of the  Doctor
    private int  doctorCharge; // Charge for the  Doctor
    private ArrayList< Patient> patients; // List to store  Patients enrolled in the  Doctor

    // Constructor to initialize the  Doctor's details
    public  Doctor(String  doctorName, String  doctorId, int  doctorCharge) {
        this.doctorName =  doctorName;
        this.doctorCharge =  doctorCharge;
        this.doctorId =  doctorId;
        this.patients = new ArrayList<>();
    }

    // Getter method to get the name of the  Doctor
    public String getName() {
        return  doctorName;
    }

    // Getter method to get the charges of the  Doctor
    public int getCharges() {
        return  doctorCharge;
    }

    // Getter method to get the ID of the  Doctor
    public String getId() {
        return  doctorId;
    }

    // Method to add  Patient in the  Doctor
    public void consult(Patient  patient) {
        patients.add( patient);
        System.out.println( patient.getName() + " has been alloted to  " +  doctorName);
    }

    // Method to display the details of the  Doctor and  Patients
    public void display() {
        System.out.println(" Patients admitted to \"" +  doctorName + "\"");
        for ( Patient  patient :patients) {
            System.out.println(" Patient Name: \"" +  patient.getName() + "\"  Patient ID: \"" +  patient.getId() + "\"");
        }
    }
    public ArrayList<Patient> arrayList(){
        return patients;
    }
}

public class Hospital{
    public static void main(String[] args) {
        // Creating  Patient objects
        System.out.println("Name of the Hospital is: AIIMS Bhopal");
         Patient  patient1 = new  Patient("Gagan Tantwar", "PT123");
         Patient  patient2 = new  Patient("Shubham Rajput", " PT232");
         Patient  patient3 = new  Patient("Harshit Patel", "PT302");

        // Creating  Doctor objects
         Doctor  doctor1 = new  Doctor("Dr Rajesh Khare ", "DT301", 5000);
         Doctor  doctor2 = new  Doctor("Dr Santosh Jhosi", "DT302", 6000);
         Doctor  doctor3 = new  Doctor("Dr Pinki Sharma", "DT303", 7000);

        System.out.println(" ");

        // Adding  doctors to  Patients
         patient1.addDoctor( doctor1);
         patient2.addDoctor( doctor2);
         patient3.addDoctor( doctor3);
         patient1.addDoctor( doctor3);
         patient3.addDoctor( doctor1);

        System.out.println(" ");
        
        System.out.println("===== patient ==== ");
        // Displaying  Patient details and  doctors
         patient1.display();
         System.out.println(" ");
         patient2.display();
         System.out.println(" ");
         patient3.display();
         System.out.println(" ");
         System.out.println(" ");


        System.out.println(" ");

        System.out.println("===== doctor ==== ");
        // Displaying  Doctor details and enrolled  Patients
         doctor1.display();
        System.out.println(" ");
         doctor2.display();
        System.out.println(" ");
         doctor3.display();
        System.out.println(" ");
        System.out.println(" ");
        
      

        
    }
}
