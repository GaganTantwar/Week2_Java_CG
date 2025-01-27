package hospitalmanagement;

public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private double additionalCharges;
    private String diagnosis;
    private StringBuilder medicalRecords;

    // Constructor to initialize outpatient details
    public OutPatient(String patientId, String name, int age, double consultationFee, double additionalCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.additionalCharges = additionalCharges;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee + additionalCharges;
    }

    // Encapsulation for sensitive data
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:\n" + medicalRecords);
    }
}


