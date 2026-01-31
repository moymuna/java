
package primenumber;

import java.util.Scanner;


public class PrimeNumber {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        int primeNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                primeNumber = primeNumber + 1;
            }
        }
        if (primeNumber == 2) {
            System.out.println("it is a prime number");    
        } else {
            System.out.println("it is not a prime number");
        } 
    }
    
}
