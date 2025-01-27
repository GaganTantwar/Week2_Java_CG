package ridehailingapplication;

public class Car extends Vehicle implements GPS {
    private String currentLocation;
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double rate=getRatePerKm();
        return distance * rate;  // Simple fare calculation
    }
    @Override
    public void getVehicleDetails(){
        super.getVehicleDetails();
    }
    @Override
    public void updateCurrentLocation(String newLocation){
        currentLocation=newLocation;
    }
    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }
}
