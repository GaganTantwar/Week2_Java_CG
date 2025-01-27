package onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
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
