
package userexceotionalhandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserExceotionalHandler {

    public static void main(String[] args) {
        File file =new File("C:\\Users\\user\\Desktop\\java.text");
        try {
            PrintWriter pw=new PrintWriter(file);
            
            pw.write("Hellow PK \n");
            pw.print("Badrul");
            pw.println("Hassan");
            
        
            for(int i=1;i<=100;i++){
               pw.println(i);
            }
            
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceotionalHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s=new Scanner(file);
        while(s.hasNext()){
            System.out.println(s.nextLine());
        }
                
            }
         catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceotionalHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

