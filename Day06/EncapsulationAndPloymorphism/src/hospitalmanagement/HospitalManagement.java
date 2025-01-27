package hospitalmanagement;

public class HospitalManagement {
    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        Patient inpatient = new InPatient("P001", "John Doe", 45, 2000, 5);
        Patient outpatient = new OutPatient("P002", "Jane Smith", 30, 500, 150);

        // Display patient details and billing information dynamically
        inpatient.getPatientDetails();
        System.out.println("Total Bill: " + inpatient.calculateBill());
        System.out.println("---------------------------");

        outpatient.getPatientDetails();
        System.out.println("Total Bill: " + outpatient.calculateBill());
        System.out.println("---------------------------");

        // Manage medical records

        inpatient.addRecord("Initial diagnosis: Fever");
        inpatient.addRecord("Prescribed medication: Paracetamol");
        inpatient.viewRecords();


        outpatient.addRecord("Consultation: Skin allergy");
        outpatient.addRecord("Prescribed medication: Antihistamines");
        outpatient.viewRecords();
    }
}
