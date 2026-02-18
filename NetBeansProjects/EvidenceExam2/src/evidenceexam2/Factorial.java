
package evidenceexam2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of 5 is " + factorial);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + input + " is " + factorial);
    }
}
