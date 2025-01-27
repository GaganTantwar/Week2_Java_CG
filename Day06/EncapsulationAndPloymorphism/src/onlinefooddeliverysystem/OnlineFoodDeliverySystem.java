package onlinefooddeliverysystem;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        FoodItem vegBurger = new VegItem("Veg Burger", 100, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 300, 1);

        // Display item details
        vegBurger.getItemDetails();
        System.out.println("Total Price: " + vegBurger.calculateTotalPrice());
        System.out.println("------------------------");

        chickenPizza.getItemDetails();
        System.out.println("Total Price: " + chickenPizza.calculateTotalPrice());
        System.out.println("------------------------");

        // Apply discounts using polymorphism

        vegBurger.applyDiscount(10); // 10% discount on veg burger
        System.out.println("Veg Burger Discount: " + vegBurger.getDiscountDetails());
        System.out.println("Price after Discount: " + (vegBurger.calculateTotalPrice() - vegBurger.getDiscountDetails()));


        chickenPizza.applyDiscount(15); // 15% discount on chicken pizza
        System.out.println("Chicken Pizza Discount: " + chickenPizza.getDiscountDetails());
        System.out.println("Price after Discount: " + (chickenPizza.calculateTotalPrice() - chickenPizza.getDiscountDetails()));
    }
}
