package doanquanlycuahang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {
    public static Connection conn = null;
    public String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    public String uname = "QLCH";
    public String upass = "QLCH";
    public MyConnect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Oracle JDBC Driver Registered!");
            conn = DriverManager.getConnection(url, uname, upass);
            if (conn != null) { 
                System.out.println("Connected to the database"); 
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
