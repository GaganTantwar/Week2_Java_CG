package vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private int rentalDays;
    private int  rentalCost;
    private double finalPremium;
    public Truck(String vehicleNumber,String type,int rentalRate,int rentalDays){
        super(vehicleNumber,type,rentalRate);
        this.rentalDays=rentalDays;
    }
    @Override
    public int calculateRentalCost(){
        int rentalRate=getRentalRate();
        rentalCost=rentalDays*rentalRate;
        return rentalCost;
    }
    @Override
    public void calculateInsurance(double initialVaule,double rateOfOwnDamage,int thirdPartyPremiun,int addOnCovers,double noClaimBonus ){
        double ownDamagePremium=initialVaule*(double)rateOfOwnDamage/100;
        double discount=ownDamagePremium*(double)noClaimBonus/100;
        finalPremium=(ownDamagePremium+thirdPartyPremiun+addOnCovers)-discount;

    }
    @Override
    public double getInsuranceDetails(){
        return finalPremium;
    }
    @Override
    public void displayInfo(){
        System.out.println("Number of the Vehicle: "+getNumber());
        System.out.println("Type of the Vehicle: "+getType());
        System.out.println("Rental Rate of the day: "+getRentalRate());
        System.out.println("Total Rental Cost: "+calculateRentalCost());
    }
}



