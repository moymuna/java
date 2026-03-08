
package posemployee.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import posemployee.model.EmployeeModel;
import posemployee.util.DBUtil;

public class EmployeeDao {

    DBUtil util = new DBUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    EmployeeModel e;

    public void save(EmployeeModel e) {
        sql = "insert into employee(name,salary,email) values(?,?,?)";
        try {
            ps = util.getcon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(1, e.getEmail());
            ps.executeUpdate();
            ps.close();
            util.getcon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<EmployeeModel> findAll() {
        List<EmployeeModel> eList = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = util.getcon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                EmployeeModel e = new EmployeeModel();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                eList.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eList;

    }
}
