package doanquanlycuahang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConnect {
    public static Connection conn = null;
    public String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public String uname = "QLCH";
    public String upass = "QLCH";
    public String login(String phoneNumber) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn = DriverManager.getConnection(url, uname, upass);
        String sql = "SELECT CHUCVU FROM NHANVIEN WHERE MANV = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, phoneNumber);
        rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getString("CHUCVU");
        } else {
            return null;
        }
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        return null;
    } finally {
        // Close resources...
    }
}
    public MyConnect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Oracle JDBC Driver Registered!");
            conn = DriverManager.getConnection(url, uname, upass);
            if (conn != null) { 
                System.out.println("Connected to the database"); 
                System.out.println("Application is running..."); 
            } 
            else { 
                System.out.println("Failed to make connection!"); 
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
    }
}
