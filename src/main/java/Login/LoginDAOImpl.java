package Login;

import Admin.AdminModel;
import Connection.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class LoginDAOImpl implements LoginDAO {

    private Connection conn;
    private ResultSet rs;
    

    public LoginDAOImpl() {
        conn = Ticket.getConn();
    }

    @Override
    public AdminModel adminLogin(String user, String pass) {
        AdminModel admin = null;
        try {
            if (user != null && !user.isEmpty() && pass != null && !pass.isEmpty()) {
                String sql = "SELECT * FROM admin WHERE username = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, user);
                rs = stmt.executeQuery();

                if (rs.next()) {

                    String hash = rs.getString("hash");
                    System.out.println("hash:" + hash);
                    if (BCrypt.checkpw(pass, hash)) {
                        System.out.println("Password matched!");
                        admin = new AdminModel();
                        admin.setStaff_id(rs.getString("staff_id"));
                        admin.setStFname(rs.getString("fname"));
                        admin.setStMname(rs.getString("mname"));
                        admin.setStLname(rs.getString("lname"));
                        
//                        Plannning to put another verification using fingerprint
                    } else {
                        System.out.println("Not matched");
                        JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }

        return admin;
    }

}
