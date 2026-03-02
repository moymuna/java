
package evidenceexam4;

public class ExceptionHandler {
    public static void main(String[] args) {
        int i=10;
        int j=0;
        try {
            double k=i/j;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}
