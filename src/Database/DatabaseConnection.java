package Database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import View.cashierAccount;
import View.managerAccount;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    public Connection con;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/istore", "root", "");
            System.out.println("connected");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void login(String username, String password) {
        if (username.equals("manager") && password.equals("manager123")) {
            managerAccount m1 = new managerAccount();
            m1.setVisible(true);

        } else if (username.equals("cashier") && password.equals("cashier123")) {
            cashierAccount c1 = new cashierAccount();
            c1.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password");
        }
    }

    public void Add(String pName, String model, String price, String qty) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void Delete(String pName, String model, String price, String qty) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
