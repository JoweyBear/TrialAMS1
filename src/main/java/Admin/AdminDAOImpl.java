package Admin;

import Connection.Ticket;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminDAOImpl implements AdminDAO {

    private Connection conn;
    private ResultSet rs;

    public AdminDAOImpl() {
        conn = Ticket.getConn();
    }

    @Override
    public ResultSet fetchAll() {
        try {
            String sql = "SELECT staff_id as 'Staff ID', fname as 'First Name', "
                    + "mname as 'Middle Name', lname as 'Last Name',"
                    + "position as 'Position' from staff OFFSET 1";
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    @Override
    public void save(AdminModel admin) {
        try {
            String sql = "Insert into staff values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, admin.getStaff_id());
            stmt.setString(2, admin.getStFname());
            stmt.setString(3, admin.getStMname());
            stmt.setString(4, admin.getStLname());
            stmt.setString(5, admin.getPosition());
//            stmt.setString(6, staff.getUsername());
////            System.out.println(staff.getPass());
//            stmt.setString(7, staff.getPass());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Admin Added!");
//        } catch (SQLIntegrityConstraintViolationException  e) {
//            JOptionPane.showMessageDialog(null, "Duplicate Username");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(AdminModel admin) {
        try {
            String sql = "Update admin set fname = ?, "
                    + "mname = ?, lname = ?, position = ? "
                    //                    + "username = ?, hash = ?"
                    + "where staff_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, admin.getStFname());
            stmt.setString(2, admin.getStMname());
            stmt.setString(3, admin.getStLname());
            stmt.setString(4, admin.getPosition());
            stmt.setString(5, admin.getStaff_id());
//            stmt.setString(6, staff.getPass());
//            System.out.println(staff.getUsername());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Admin Information Updated!");

        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    @Override
    public void delete(String admin_id) {
        try {
            String sql = "Delete from admin where staff_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, admin_id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Admin Deleted!");
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
