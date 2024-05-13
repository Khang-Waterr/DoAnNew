package doanquanlycuahang;
import QuanLyCuaHang.GUI.DatMonAnGUI;
import QuanLyCuaHang.GUI.HoaDonGUI;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.sql.*;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
        new MyConnect();
        DatMonAnGUI khgui = new DatMonAnGUI();
        
        khgui.setVisible(true);
   } 
   
}



