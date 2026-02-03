
package methodmaking;

import java.util.Arrays;
import java.util.Scanner;


public class MethodMaking {

    
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        System.out.println("how many number yout want compair");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println("begining of loop" + Arrays.toString(numbers));
        for (int index = 0; index < n; index++) {
            System.out.println("enter Your " + (index + 1) + " number");
            int userInput = input.nextInt();
            numbers[index] = userInput;
        }
        System.out.println("ending of loop" + Arrays.toString(numbers));

//        findMaxNumber(numbers);
         findAvarageNumber(numbers);
    }
//    mathod

//    public static void findMaxNumber(int[] numbers) {
//        int max = 0;
//        for (int item : numbers) {
//            if (item >= max) {
//                max = item;
//            }
//        }
//        System.out.println("max number is " + max);
//     }
        
         public static void findAvarageNumber(int[] numbers) {
        float avg = 0;
        int size = numbers.length;
        int sum = 0;
        for (int item : numbers) {
            sum = sum + item;
        }
        avg = sum / size;
        System.out.println("average is " + avg);
    }

        //    public static void checkFactorialNumber(int number){
//    Scanner

   
    
}
