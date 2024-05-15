package QuanLyCuaHang.GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import QuanLyCuaHang.DAO.CTHoaDonDAO;
import QuanLyCuaHang.DTO.CTHoaDonDTO;

import java.awt.*;
import java.util.ArrayList;

public class xemChiTietHoaDonGUI extends JFrame{
	  private JTable chiTietTable;
	  private DefaultTableModel model;
	  private JLabel lblMaHD, lblMaSP, lblSoLuong, lblDonGia, lblThanhTien;
	  private CTHoaDonDAO ctHDDAO;


	    public xemChiTietHoaDonGUI(int maHD) {
	    	 setTitle("Chi Tiết Hóa Đơn");
	         setSize(400, 200);
	         setLocationRelativeTo(null);
	         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	         // Tạo các nhãn để hiển thị chi tiết hóa đơn
	         lblMaHD = new JLabel();
	         lblMaSP = new JLabel();
	         lblSoLuong = new JLabel();
	         lblDonGia = new JLabel();
	         lblThanhTien = new JLabel();
	         
	         // Lấy thông tin chi tiết hóa đơn từ CSDL
	         ctHDDAO = new CTHoaDonDAO();
	         CTHoaDonDTO cthd = ctHDDAO.getCTHoaDonTheoMaHD(maHD);
				if (cthd != null) {
					hienThiChiTietHoaDon(cthd.getMaHD(), cthd.getMaSP(), cthd.getSoLuong(), cthd.getDonGia(),
							cthd.getThanhTien());
				}
				else {
					JOptionPane.showMessageDialog(null, "Không tìm thấy chi tiết hóa đơn");
				}
	         // Tạo panel để chứa các nhãn
	         JPanel panel = new JPanel(new GridLayout(5, 2));
	         panel.add(lblMaHD);
	         panel.add(new JLabel());
	         panel.add(lblMaSP);
	         panel.add(new JLabel());
	         panel.add(lblSoLuong);
	         panel.add(new JLabel());
	         panel.add(lblDonGia);
	         panel.add(new JLabel());
	         panel.add(lblThanhTien);
	         panel.add(new JLabel());

	         // Thêm panel vào JFrame
	         add(panel, BorderLayout.CENTER);
	         //this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	         this.setVisible(true);
	    }
	    
	    public void hienThiChiTietHoaDon(int maHD, int maSP, int soLuong, int donGia, int thanhTien) {
	        lblMaHD.setText("Mã hóa đơn: " + maHD);
	        lblMaSP.setText("Mã sản phẩm: " + maSP);
	        lblSoLuong.setText("Số lượng: " + soLuong);
	        lblDonGia.setText("Đơn giá: " + donGia);
	        lblThanhTien.setText("Thành tiền: " + thanhTien);
	    }
	    

}
