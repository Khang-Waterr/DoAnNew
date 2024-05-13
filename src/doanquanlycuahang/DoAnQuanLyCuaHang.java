package doanquanlycuahang;
import QuanLyCuaHang.GUI.DatMonGUI;
import QuanLyCuaHang.GUI.HoaDonGUI;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.sql.*;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
        new MyConnect();
        DatMonGUI khgui = new DatMonGUI();
        
        khgui.setVisible(true);
   } 
   
}



