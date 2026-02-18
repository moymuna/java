package evidenceexam.in;

public class Truc extends vehicle {

    int weight;

    public Truc() {
    }

    public Truc(int weight) {
        this.weight = weight;
    }

    public Truc(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice = regularPrice - (regularPrice * .10);
        } else {
            return regularPrice;
        }

    }

}
