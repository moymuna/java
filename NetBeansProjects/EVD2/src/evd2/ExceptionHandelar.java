
package evd2;

public class ExceptionHandelar {
    public static void main(String[] args) {
//        try {
//            int result=10/0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
        int myArry[]=new int[5];
        try {
            myArry[4]=0;
        } catch (Exception e) {
            System.out.println("incorrect");
        }
        
        
    }
}
