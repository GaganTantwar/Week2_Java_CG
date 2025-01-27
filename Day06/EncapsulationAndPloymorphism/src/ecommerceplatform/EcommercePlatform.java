package ecommerceplatform;

public class EcommercePlatform {
    public static void main(String args[]){
        Product fan=new Electronic("PID210","Celling Fan",2000,10);
        fan.displayInfo();
        Product shirt=new Clothing("PID541","White Shirt",500,5);
        shirt.displayInfo();
        Product noodles=new Groceries("PID572","Spicy Noodles",25,0);
        noodles.displayInfo();
    }
}
