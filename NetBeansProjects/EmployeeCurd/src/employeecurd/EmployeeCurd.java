
package employeecurd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeCurd {
    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        saveData("Emran Hossain", "2020-12-24", "Teacher", 50000);
        saveData("BAdrul Hassan", "2022-11-11", "Teacher", 30000);
        showAll();
        update(2, "Emon", "2025-10-02","teacher" , 450000);
        showAll();
        delete(2);
        showAll();
    }
    public static Connection getCon(){
        
        String url = "jdbc:mysql://localhost:3306/jeestore";
        String user = "root";
        String Password = "1234";
        String driver = "com.mysql.cj.jdbc.Driver";
       Connection con= null;
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, user, Password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return con;
    
    }
    public static void saveData(String name,String joining_date, String designation, double salary ){
    String sql="insert into employee(name,joining_date,designation,salary)value(?,?,?,?)";
    
        try {
            ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDate(2, Date.valueOf(joining_date));
             ps.setString(3, designation);
            ps.setDouble(4, salary);
           
            ps.executeUpdate();
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static void showAll(){
    String sql="select* from employee";
        try {
            ps = getCon().prepareStatement(sql);
             rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id: " + rs.getInt(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("joining Date: "+rs.getDate(3));
                System.out.println("designation: " + rs.getString(4));
                 System.out.println("salary: " + rs.getDouble(5));
                System.out.println("==========**========");
            }

            ps.close();
            getCon().close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update(int id,String name,String joining_date, String designation, double salary){
    String sql="update employee set name=?,joining_date=?,designation=?,salary=? where id=?";
        try {
            ps = getCon().prepareStatement(sql);
             ps.setString(1, name);
            ps.setDate(2, Date.valueOf(joining_date));
             ps.setString(3, designation);
            ps.setDouble(4, salary);           
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void delete(int id){
    String sql="delete from employee where id=?";
        try {
            ps=getCon().prepareStatement(sql);
          ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeCurd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
