
package evidenceexam2;

import java.util.Scanner;

public class SumOfPositiveIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer Number");
        int input = scanner.nextInt();
        int sum = 0;
        while (input >= 0) {
            sum = sum + input;
            System.out.println("Enter Integer Number");
            input = scanner.nextInt();
        }
        scanner.close();
        System.out.println("sum is " + sum);

    }
}
