package vehiclerentalsystem;

public abstract class Vehicle implements Insurable{
    private String vehicleNumber;
    private String type;
    private int rentalRate;
    public Vehicle(String vehicleNumber,String type,int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }

    public int getRentalRate() {
        return rentalRate;
    }
    abstract public int calculateRentalCost();
    abstract public void displayInfo();
}
