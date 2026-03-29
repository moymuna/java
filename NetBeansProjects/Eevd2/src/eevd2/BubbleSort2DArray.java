
package eevd2;

import java.util.Arrays;

public class BubbleSort2DArray {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };
        System.out.println("2D Array  " +Arrays.deepToString(matrix));
        for (int[] item : matrix) {
            System.out.println("Single Array  "+Arrays.toString(item));
            for (int i = 0; i < item.length - 1; i++) {
                for (int j = 0; j < item.length - 1 - i; j++) {
                    if (item[j] > item[j + 1]) {
                        int temp = item[j];
                        item[j] = item[j + 1];
                        item[j + 1] = temp;
                    }
                }
            }
        }
        for(int [] item:matrix){
            System.out.println("Sorting Matrix  "+Arrays.toString(item));
        }
    }
}
