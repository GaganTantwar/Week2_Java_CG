package ridehailingapplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Vehicle car = new Car("C123", "John Doe", 10.0);
        Vehicle bike = new Bike("B456", "Jane Doe", 5.0);
        Vehicle auto = new Auto("A789", "Alex Smith", 7.0);
        car.getVehicleDetails();
        bike.getVehicleDetails();
        auto.getVehicleDetails();
        car.updateCurrentLocation("MP Nagar");
        String location= car.getCurrentLocation();
        System.out.println("New Location: "+location);
    }
}
