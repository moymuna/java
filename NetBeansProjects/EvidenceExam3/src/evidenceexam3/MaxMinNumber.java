
package evidenceexam3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myArray[] = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter NUmber");
            myArray[i] = input.nextInt();
        }
        System.out.println("All Numbers " + Arrays.toString(myArray));

        int max = myArray[0];
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
        }
        System.out.println("max number is "+max);
        System.out.println("min number is "+min);
    }

}
