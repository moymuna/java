
package eevd2;

public class exceptionHandelar {
    public static void main(String[] args) {
//        try {
//            int result=10/0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        int myArray[]=new int[5];
        try {
           myArray[6]=0; 
        } catch (Exception e) {
            System.out.println("incorrect");
                 
        }
    }
}
