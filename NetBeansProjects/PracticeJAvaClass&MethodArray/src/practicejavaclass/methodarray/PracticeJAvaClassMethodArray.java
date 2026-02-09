
package practicejavaclass.methodarray;

import practicejavaclass.methodarray.discount.CalculatePrice;

public class PracticeJAvaClassMethodArray {

    public static void main(String[] args) {
        CalculatePrice input=new CalculatePrice();
        input.unitPrice=500;
        input.quantity=3;
        System.out.println(input.discountPrice());
                
    }
    
}
