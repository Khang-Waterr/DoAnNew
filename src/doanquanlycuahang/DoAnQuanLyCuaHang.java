package doanquanlycuahang;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
         System.out.println("Hello World!");
         new KhachHangGUI().setVisible(true);
         
    }
    
}