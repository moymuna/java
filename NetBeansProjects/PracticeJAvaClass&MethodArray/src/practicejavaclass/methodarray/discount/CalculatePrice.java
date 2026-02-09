package practicejavaclass.methodarray.discount;

public class CalculatePrice {

    public double unitPrice;
    public double quantity;

    public double discountPrice() {
        double price = unitPrice * quantity;
        double discountRate = 0.0;

        if (price <= 100) {
            discountRate = 0.2;
        } else if (price <= 200) {
            discountRate = 0.3;
        } else if (price <= 400) {
            discountRate = 0.4;
        } else {
            discountRate = 0.5;
        }
        double discountAmount = price * discountRate;
        double totalamount = price - discountAmount;
        return totalamount;
    }
}
