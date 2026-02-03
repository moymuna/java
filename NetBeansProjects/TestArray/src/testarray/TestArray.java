
package testarray;

import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.AEADBadTagException;


public class TestArray {

    public static void main(String[] args) {
//        String studentName[] = new String[14];
//        int studentAge[] = new int[14];
//
//        studentName[0] = "Badrul";
//        studentName[1] = "emon";
//        studentName[2] = "hasan";
//        studentName[3] = "shimuul";
//
//        studentAge[0] = 23;
//        studentAge[1] = 21;
//        studentAge[2] = 25;
//        studentAge[3] = 26;
//        studentAge[4] = 27;
//
//        System.out.println(studentName);
//        System.out.println(studentAge);
//
//        System.out.println(Arrays.toString(studentName));
//        System.out.println(Arrays.toString(studentAge));
//
//        System.out.println(studentName[3] + " " + studentAge[3]);
        




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
                
     
    }
    
}
