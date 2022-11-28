package tdd.checkOrder;

public class CheckOrder {

    private String cashierName;
    private String product;
    private double price;


    private int quantity;

    public CheckOrder(String product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}
