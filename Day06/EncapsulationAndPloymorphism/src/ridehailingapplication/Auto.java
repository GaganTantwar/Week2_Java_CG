package ridehailingapplication;

public class Auto extends Vehicle implements GPS{
    private String currentLocation;
    public Auto(String vehicleId, String driverName, double ratePerKm) {
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
