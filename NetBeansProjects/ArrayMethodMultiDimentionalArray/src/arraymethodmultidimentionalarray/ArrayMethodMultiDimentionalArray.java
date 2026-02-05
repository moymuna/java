
package arraymethodmultidimentionalarray;

public class ArrayMethodMultiDimentionalArray {

    public static void main(String[] args) {
     int numbers[][]={{1,2,3},{4,5,6},{7,8,9}};
     System.out.println(sumMultidimentionalArray(/*numbers*/));
       
    }
    public static void sumMultidimentionalArray(int[][] myArray){
    int sum=0;
    for (int[] row:myArray){
    for(int col:row){
    sum=sum+col;
    }
    }
        System.out.println(sum);
    }
    
}
