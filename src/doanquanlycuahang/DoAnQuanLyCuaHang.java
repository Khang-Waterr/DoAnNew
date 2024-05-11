package doanquanlycuahang;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.sql.*;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
        new MyConnect();
        KhachHangGUI khgui = new KhachHangGUI();
        khgui.setVisible(true);
   }  
   
    public static void changLNF(String nameLNF) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }
}



