package vehiclerentalsystem;

public class VehicleRentalSystem{
    public static void main(String args[]) {
        Vehicle xuv = new Car("MP-04-KL-2032", "SUV Car", 500, 5);
        Vehicle shine = new Bike("MP-04-ZJ-3816", "Normal Bike", 100, 10);
        Vehicle tanker = new Truck("MP-04-LK-9631", "Water Tanker", 1000, 10);
        xuv.displayInfo();
        shine.displayInfo();
        tanker.displayInfo();
        xuv.calculateInsurance(1500000,5,50000,20000,5.5);
        double insurance= xuv.getInsuranceDetails();
        System.out.println("Insurance :"+insurance);

    }

}
