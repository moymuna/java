
package posemployee.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import posemployee.model.EmployeeModel;
import posemployee.util.DBUtil;

public class EmployeeDao {
    DBUtil util=new DBUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql=null;
    EmployeeModel e;
    
    public void save(EmployeeModel e){
    sql="insert into employee(name,salary,email) values(?,?,?)";
        try {
            ps=util.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(1, e.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
