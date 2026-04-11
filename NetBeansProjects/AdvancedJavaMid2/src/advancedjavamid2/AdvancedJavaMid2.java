
package advancedjavamid2;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvancedJavaMid2 {
    static PreparedStatement ps;
    static  ResultSet rs;

    public static void main(String[] args) {
        
        
    }
    public static Connection getcon(){
        String url="jdbc:mysql://localhost:3306/employee";
        String user="root";
        String password="1234";
         String driver="com.mysql.cj.jdbc.Driver";
        Connection con=null;
        
        try {
            Class.forName(driver);
          con=(Connection) DriverManager.getConnection(url, user, password);
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdvancedJavaMid2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdvancedJavaMid2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
       
    }
    
    public static void creatEmployee(String name ,double salary ,String department){
    String creatSql=" insert into Emmployee(name,salary,department) value(?,?,?)";
 
    
    public static void save(String name, double salary, String department) {
        String sql = "insert into employee(name, salary, designation) "
                + "values(?,?,?)";
        try {
            ps = getcon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(3, designation);
            ps.setDouble(2, salary);

            ps.executeUpdate();

            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void read() {
        String sql = "select * from employee";

        try {
            ps = getcon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Salary: " + rs.getDouble(3));
                System.out.println("Designation: " + rs.getString(4));

                System.out.println("========**========");
            }
            ps.close();
            getCon().close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void update(int id, String name, double salary, String designation) {
        String sql = "update employee set name = ?, salary =?, designation =? where id = ?";
        try {
            ps = getcon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, designation);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void delete(int id) {
        String sql = "delete from employee where id = ?";
        try {
            ps = getcon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CrudEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
