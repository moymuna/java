
package evidenceexam.in;

public class vehicle {

    int speed;
    double regularPrice;
    String color;

    public vehicle() {
    }

    public vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}
