
package evidenceexam4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandler2 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\java3.txt");
        try {
            PrintWriter pw = new PrintWriter(file);

            pw.write("hello java \n");
            pw.println("hello java");
            pw.print("yfgdr");

            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionHandler2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner s= new Scanner(file);
            while(s.hasNext()){
            
                System.out.println(s.nextLine());}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionHandler2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
