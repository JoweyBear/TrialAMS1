package Connection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ticket {

    private static Connection connection;

    private Ticket() {
    }

    public static Connection getConn() {
        try {
            InputStream input = Ticket.class.getResourceAsStream("/Configurations/Outlet.properties");
            Properties outlet = new Properties();
            outlet.load(input);
            Class.forName(outlet.getProperty("driver"));
            connection = DriverManager.getConnection(outlet.getProperty("url"), outlet.getProperty("user"), outlet.getProperty("pass"));
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

//    public static void main(String[] args) {
//        System.out.println(getConn());
//    }
}
