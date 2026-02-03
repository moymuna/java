
package boblesortarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class BobleSortArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many number you want compair");
        int n = input.nextInt();
        int numbers[] = new int[n];
        System.out.println("begining of loop" + Arrays.toString(numbers));
        for (int index = 0; index < n; index++) {
            System.out.println("enter Your " + (index + 1) + " number");
            int userInput = input.nextInt();
            numbers[index] = userInput;
        }
        System.out.println("ending of loop" + Arrays.toString(numbers));
        
        
        int newArray[] = sort(numbers);
        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));
                                  
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    
}
