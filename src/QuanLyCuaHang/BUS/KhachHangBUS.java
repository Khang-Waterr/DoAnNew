package QuanLyCuaHang.BUS;

import QuanLyCuaHang.DAO.KhachHangDAO;
import QuanLyCuaHang.DTO.KhachHangDTO;
import doanquanlycuahang.MyDialog;
import java.util.ArrayList;

public class KhachHangBUS {

    public ArrayList<KhachHangDTO> listKhachHang = new ArrayList<>();
    public KhachHangDAO khachHangDAO = new KhachHangDAO();
    
    public ArrayList<KhachHangDTO> getListKhachHang() {
        this.listKhachHang = khachHangDAO.getListKhachHang();
        return listKhachHang;
    }
    
    
    public ArrayList<KhachHangDTO> timKiemKhachHang(String tuKhoa) {
        tuKhoa = tuKhoa.toLowerCase();
        ArrayList<KhachHangDTO> dskh = new ArrayList<KhachHangDTO>();
        for (KhachHangDTO kh : listKhachHang) {
            String makh = Integer.toString(kh.getMaKH());
            String ho = kh.getHo().toLowerCase();
            String ten = kh.getTen().toLowerCase();
            String gioiTinh = kh.getGioiTinh().toLowerCase();
            if (ho.contains(tuKhoa) || ten.contains(tuKhoa) || gioiTinh.contains(tuKhoa) || makh.contains(tuKhoa)) {
                dskh.add(kh);
            }
        }
        return dskh;
    }
    
    
    
    public boolean themKhachHang(String maKH, String ho, String ten, String gioitinh) {
        //Kiểm tra đã nhập mã chưa
        if (maKH.trim().equals("")) {
            new MyDialog("Không được để trống mã!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        //Kiểm tra đã nhập tên chưa
        if (ten.trim().equals("")) {
            new MyDialog("Không được để trống tên!", MyDialog.ERROR_DIALOG);
            return false;
        }
        //Kiểm tra số nhập có hợp lệ không
        try {
            Integer.parseInt(maKH);
        } catch (NumberFormatException e) {
            new MyDialog("Mã không hợp lệ!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        //Tạo biến khách hàng để thêm
        KhachHangDTO kh = new KhachHangDTO(Integer.parseInt(maKH), ho, ten, gioitinh, 0);
        
        //Thêm và tạo cờ kiểm tra đã thêm thành công hay chưa
        boolean flag = khachHangDAO.addKhachHang(kh);
        
        //Kiểm tra cờ để xuất thông báo phù hợp
        if (flag) {
            new MyDialog("Thêm thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Thêm thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    
    public boolean suaKhachHang(String makh, String ho, String ten, String gioiTinh) {   
        //Kiểm tra đã nhập tên chưa
        if (ten.trim().equals("")) {
            new MyDialog("Không được để trống tên!", MyDialog.ERROR_DIALOG);
            return false;
        }
        
        //Tạo biến để lưu thông tin sửa
        KhachHangDTO kh = new KhachHangDTO();
        kh.setHo(ho);
        kh.setTen(ten);
        kh.setGioiTinh(gioiTinh);
        
        //Sửa khách hàng có mã khách hàng được nhập thành thông tin khách hàng lưu trong biến
        boolean flag = khachHangDAO.updateKhachHang(Integer.parseInt(makh), kh);
        if (flag) {
            new MyDialog("Sửa thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Sửa thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }

    
    public boolean xoaKhachHang(int maKH) {
        boolean flag = false;
        
        //Xóa khách hàng lưu trong cơ sở dữ liệu
        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
        if(dlg.getAction() != MyDialog.OK_OPTION) return false;
        flag = khachHangDAO.deleteKhachHang(maKH);
        //Kiểm tra cờ để xuất thông báo thích hợp
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
}
