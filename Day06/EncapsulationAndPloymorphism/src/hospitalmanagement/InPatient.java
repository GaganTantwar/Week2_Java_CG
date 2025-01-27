package hospitalmanagement;

public class InPatient extends Patient implements MedicalRecord{
    private int roomChargePerDay;
    private int numberOfDays;
    private String diagnosis;
    private String medicalHistory;
    private StringBuilder medicalRecords;

    // Constructor to initialize inpatient details
    public InPatient(String patientId, String name, int age, int roomChargePerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.numberOfDays = numberOfDays;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * numberOfDays;
    }

    // Encapsulation for sensitive data
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
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
