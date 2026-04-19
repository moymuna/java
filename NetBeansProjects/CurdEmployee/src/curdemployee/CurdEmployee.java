package curdemployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CurdEmployee {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        save("sadia", 40000, "HR");
        show();
        update(2,"badrul",40000, "IT");
        update(3, "rehana", 400000, "IT");
        show();
        delete(3);
        show();
    }

    public static Connection getcon() {
        String url = "jdbc:mysql://localhost:3306/employee2";
        String user = "root";
        String Password = "1234";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, Password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void save(String name, double salary, String department) {
        String sql = "insert into employee2(name, salary, department) value(?,?,?)";

        try {
            ps = getcon().prepareStatement(sql);
        ps.setString(1, name);
        ps.setDouble(2, salary);
        ps.setString(3, department);
        ps.executeUpdate();
        ps.close();
        getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void show() {
        String sql = "select*from employee2";
        try {
            ps = getcon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id: " + rs.getInt(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("salary: " + rs.getDouble(3));
                System.out.println("department: " + rs.getString(4));
                System.out.println("==========**========");
            }

            ps.close();
            getcon().close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void update(int id, String name, double salary, String department) {
        String sql = "update employee2 set name=?,salary=?,department=? where id=?";
        try {
            ps = getcon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, salary);
            ps.setString(3, department);
            ps.setInt(4, id);
            ps.executeUpdate();
            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
public static void delete(int id){
    String sql="delete from employee2 where id=?";
        try {
            ps=getcon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CurdEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
