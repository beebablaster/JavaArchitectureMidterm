public class Laptop implements Device {
    public String productModel;
    public int productPrice;

    public Laptop(String productModel, int productPrice) {
        this.productModel = productModel;
        this.productPrice = productPrice;
    }

    public void discount(int percent) {
        this.productPrice -= this.productPrice * (percent / 100);
    }

    public int getPrice(){
        return this.productPrice;
    }
}
