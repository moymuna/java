
package evidenceexam4;

public class Vehicle {
    int speed;
    double regularPrice;
    String colour;

    public Vehicle() {
    }

    public Vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice(){
    return regularPrice;
    }
    
    
}
