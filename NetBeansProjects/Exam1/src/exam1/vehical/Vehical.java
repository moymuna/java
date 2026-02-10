
package exam1.vehical;

public class Vehical {
    private int speed;
    private double regularPrice;
    private String color;

    public Vehical() {
    }

    public Vehical(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehical{" + "speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + '}';
    }
    
    public double getSalePrice(){
    return regularPrice;
    }
    
   
    }
   