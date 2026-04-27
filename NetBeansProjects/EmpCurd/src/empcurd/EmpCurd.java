
package empcurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpCurd {
    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
    
    }
    public static Connection getCon(){
    String url="jdbc:mysql://localhost:3306/jeestore";
    String user="root";
    String password="1234";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection con=null;
    
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpCurd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmpCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return con;
        
    }
    public static void save(String name,String qualification,Double salary){
        String sql="insert into teacher(name,qualification,salary)value(?,?,?)";
        
        try {
            ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, qualification);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmpCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void showAll(){
    String sql="select* from teacher";
    
        try {
            ps=getCon().prepareStatement(sql);
            ps.executeQuery();
            while(rs.next()){
              System.out.println("id: " + rs.getInt(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("qualification: " + rs.getString(3));
                System.out.println("salary: " + rs.getDouble(4));
                System.out.println("==========**========");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
