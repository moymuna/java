
package studentinfo;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        ArrayList<Student> slist=new ArrayList<>();
        
        Student s=new Student(01, "sadia","sadia@gmail.com");
        
        Student s1=new Student();
        s1.setStudentId(02);
        s1.setStudentName("rehana");
        s1.setEmail("rehana@gmail.com");
        
        slist.add(new Student(03, "jui","jui@gmail.com"));
        slist.add(s);
        slist.add(s1);
        
        System.out.println(slist);
                
                }
    
}
