package ecommerceplatform;

public class Electronic extends Product implements Taxable{
    private int dicount;
    private double discountedPrice;
    private static int tax=15;
    private double taxAmount;
    private double finalPrice;
    public Electronic(String productId,String name,int price,int discount){
        super(productId,name,price);
        this.dicount=discount;
    }
    @Override public double calculateDiscount(){
        int price=getPrice();
        discountedPrice=price-(price*(double)dicount/100);
        return discountedPrice;
    }

    @Override
    public void calculateTax() {
        int price=getPrice();
        taxAmount=(double)tax/100*price;

    }

    @Override
    public double getTaxDetails() {
        calculateTax();
        return taxAmount;
    }
    public double getFinalPrice(){
        finalPrice=discountedPrice+taxAmount;
        return finalPrice;
    }

    public void displayInfo(){
        System.out.println("Name of the Product: "+getName());
        System.out.println("Id of the Product: "+getProductId());
        System.out.println("Price of the Product: "+getPrice());
        System.out.println("Discounted Price of Product: "+calculateDiscount());
        System.out.println("Amount of Tax: "+getTaxDetails());
        System.out.println("Final Price of the product: "+getFinalPrice());
    }
}
