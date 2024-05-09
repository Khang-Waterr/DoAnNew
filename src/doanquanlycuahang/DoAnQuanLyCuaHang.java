package doanquanlycuahang;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.sql.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String uname = "QLCH";
        String upass = "QLCH";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Oracle JDBC Driver Registered!");
            con = DriverManager.getConnection(url, uname, upass);
            if (con != null) { 
                System.out.println("Connected to the database"); 
                String strsql = "Select * from khachhang";
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery(strsql);
                while (rs.next()) {
                    int id = rs.getInt("MaKH");
                    String name = rs.getString("Ten");
                    // Print data from the result set
                    System.out.println("MaKH: " + id + ", Ten: " + name);
                }
            } 
            else { 
                System.out.println("Failed to make connection!"); }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        
   }    
}


