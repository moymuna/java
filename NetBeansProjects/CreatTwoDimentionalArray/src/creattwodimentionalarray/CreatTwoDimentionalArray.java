
package creattwodimentionalarray;

import java.util.Arrays;
import java.util.Scanner;


public class CreatTwoDimentionalArray {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter  row size");
        int rowsSize = input.nextInt();

        System.out.println("enter column size");
        int coulmnSize = input.nextInt();

        int numbers[][] = new int[rowsSize][coulmnSize];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("Enter value for row " + (row + 1) + " col " + (col + 1));
                int userInput = input.nextInt();
                numbers[row][col] = userInput;
            }
        }
        System.out.println(Arrays.deepToString(numbers));

        for (int[] item : numbers) {
            for (int single : item) {
                System.out.print(single + "\t");
            }
            System.out.println("");
        }
    }
}
