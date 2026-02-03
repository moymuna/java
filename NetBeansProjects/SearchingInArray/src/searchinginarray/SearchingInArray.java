
package searchinginarray;


public class SearchingInArray {

    
    public static void main(String[] args) {
         int myArray[]={99,44,11,7,3,2,8,12,11};
         int search=12;
         int result= linearSearch(myArray, search);
         
         System.out.println("your search numbers index is "+ result);
    }
    public static int linearSearch(int[] array,int searchNumber){
    int result=1;
            for(int index=0;index<array.length;index++){
            if (array[index]==searchNumber){
            result=index;
            break;
            }
            }
            return result;
    }
    
}
