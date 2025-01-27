package ridehailingapplication;

public abstract class Vehicle implements GPS{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Driver Name: "+driverName);
        System.out.println("Rate Per Km: "+ratePerKm);
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
}


