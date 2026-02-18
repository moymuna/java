
package evidenceexam2;

import java.util.Scanner;

public class EvidenceExam2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int input = scanner.nextInt();
        int primeNumber = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                primeNumber = primeNumber + 1;
            }
        }
        if (primeNumber == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println(" it is not a prime number");
        }
    }

}
