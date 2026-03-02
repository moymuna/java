
package evidenceexam4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvidenceExam4 {

    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\user\\Desktop\\java3.txt");
            for(int i=1;i<=10;i++){
            output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvidenceExam4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EvidenceExam4.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream input=new FileInputStream("C:\\Users\\user\\Desktop\\java3.txt");
            int value;
            while((value=input.read())!=-1){
                System.out.println(value + " ");}
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvidenceExam4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EvidenceExam4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
