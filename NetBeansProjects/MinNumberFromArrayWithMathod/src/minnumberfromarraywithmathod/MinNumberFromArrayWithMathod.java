

package minnumberfromarraywithmathod;

import java.util.Arrays;
import java.util.Scanner;


public class MinNumberFromArrayWithMathod {

    
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
        
              
//        findMinNumber(numbers);
    }
//public static void findMinNumber (int[] numbers){
//    int min=numbers[0];
//    for(int item:numbers){
//    if(item<=min){
//    min=item;
//    }
//    }
//    System.out.println("min number is "+min);
//}

    
   
    

}
