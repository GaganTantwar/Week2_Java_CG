package onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private double discount;
    private static final double nonVegCharge = 50.0; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = calculateTotalPrice() * discountPercentage / 100;
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}
