package QuanLyCuaHang.DAO;

import QuanLyCuaHang.DTO.KhachHangDTO;
import doanquanlycuahang.MyConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class KhachHangDAO {

    public ArrayList<KhachHangDTO> getListKhachHang() {
        try {
            String sql = "SELECT * FROM khachhang";
            Statement stat = MyConnect.conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<KhachHangDTO> dskh = new ArrayList<>();
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMaKH(rs.getInt(1));
                kh.setHo(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setTongChiTieu(rs.getInt(5));
                dskh.add(kh);
            }
            return dskh;
        } catch (SQLException ex) {
        }
        return null;
    }

    public KhachHangDTO getKhachHang(int maKH) {
        KhachHangDTO kh = null;
        try {
            String sql = "SELECT * FROM khachhang WHERE MaKH=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maKH);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                kh = new KhachHangDTO();
                kh.setMaKH(rs.getInt(1));
                kh.setHo(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setGioiTinh(rs.getString(4));
                kh.setTongChiTieu(rs.getInt(5));
            }
        } catch (SQLException ex) {
            return null;
        }
        return kh;
    }

    public boolean addKhachHang(KhachHangDTO kh) {
        boolean result = false;
        try {
            String sql = "INSERT INTO khachhang VALUES(?,?,?,?,?)";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, kh.getMaKH());
            prep.setString(2, kh.getHo());
            prep.setString(3, kh.getTen());
            prep.setString(4, kh.getGioiTinh());
            prep.setInt(5, kh.getTongChiTieu());
            result = prep.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean deleteKhachHang(int maKH) {
        boolean result = false;
        try {
            String sql = "UPDATE khachhang SET TinhTrang=0 WHERE MaKH=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setInt(1, maKH);
            result = prep.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean updateKhachHang(int maKH, KhachHangDTO kh) {
        boolean result = false;
        try {
            String sql = "UPDATE khachhang SET Ho=?, Ten=?, GioiTinh=? WHERE MaKH=?";
            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
            prep.setString(1, kh.getHo());
            prep.setString(2, kh.getTen());
            prep.setString(3, kh.getGioiTinh());
            prep.setInt(4, maKH);
            result = prep.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }

    public boolean updateTongChiTieu(int maKH, int tongChiTieu) {
        boolean result = false;
        try {
            String sql = "UPDATE khachhang SET TongChiTieu=" + tongChiTieu + " WHERE MaKH=" + maKH;
            Statement stmt = MyConnect.conn.createStatement();
            result = stmt.executeUpdate(sql) > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }
}
