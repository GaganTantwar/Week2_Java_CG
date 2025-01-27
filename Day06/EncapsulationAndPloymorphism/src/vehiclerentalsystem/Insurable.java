package vehiclerentalsystem;
public interface Insurable{
    void calculateInsurance(double initialVaule,double rateOfOwnDamage,int thirdPartyPremiun,int addOnCovers,double noClaimBonus );
    double getInsuranceDetails();
}
