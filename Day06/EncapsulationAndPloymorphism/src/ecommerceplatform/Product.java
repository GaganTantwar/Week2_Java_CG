package ecommerceplatform;

public abstract class Product {
    private String productId;
    private String name;
    private int price;
    public Product(String productId,String name,int price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public abstract double calculateDiscount();

    public int getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
    public abstract void displayInfo();
}

