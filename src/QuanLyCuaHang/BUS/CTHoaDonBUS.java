package QuanLyCuaHang.BUS;


import QuanLyCuaHang.DAO.CTHoaDonDAO;
import QuanLyCuaHang.DTO.CTHoaDonDTO;
import doanquanlycuahang.MyDialog;

import java.util.ArrayList;

public class CTHoaDonBUS {

    public ArrayList<CTHoaDonDTO> listCTHoaDon;
    public CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
    public HoaDonBUS hdBUS = new HoaDonBUS();
    
    public CTHoaDonDTO getCTHoaDonTheoMaHD(int maHD) {
    	return ctHDDAO.getCTHoaDonTheoMaHD(maHD);
    }
    
    public boolean deleteCTHoaDon(int maHD) {
        boolean flag = false;
        
        //Xóa khách hàng lưu trong cơ sở dữ liệu
        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá?", MyDialog.WARNING_DIALOG);
        if(dlg.getAction() != MyDialog.OK_OPTION) return false;
        flag = ctHDDAO.deleteCTHoaDon(maHD);
        //Kiểm tra cờ để xuất thông báo thích hợp
        if (flag) {
            new MyDialog("Xoá thành công!", MyDialog.SUCCESS_DIALOG);
        } else {
            new MyDialog("Xoá thất bại!", MyDialog.ERROR_DIALOG);
        }
        return flag;
    }
    
    
    //Xóa đọc list, thêm đọc list vào getlist
//    public ArrayList<CTHoaDonDTO> getListCTHoaDon() {
//        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
//        return listCTHoaDon;
//    }

//    public ArrayList<CTHoaDonDTO> getListCTHoaDonTheoMaHD(String maHD) {
//        int ma = Integer.parseInt(maHD);
//        ArrayList<CTHoaDonDTO> dsct = new ArrayList<>();
//
//        for (CTHoaDonDTO cthd : listCTHoaDon) {
//            if (cthd.getMaHD() == ma)
//                dsct.add(cthd);
//        }
//
//        return dsct;
//    }
    
}

	













//    public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
//        int ma = hdBUS.getMaHoaDonMoiNhat();
//
//        donGia = donGia.replace(",","");
//        thanhTien = thanhTien.replace(",", "");
//
//        CTHoaDonDTO cthd = new CTHoaDonDTO	();
//
//        cthd.setMaHD(ma);
//        cthd.setMaSP(Integer.parseInt(maSP));
//        cthd.setDonGia(Integer.parseInt(donGia));
//        cthd.setSoLuong(Integer.parseInt(soLuong));
//        cthd.setThanhTien(Integer.parseInt(thanhTien));
//
//        ctHDDAO.addCTHoaDon(cthd);
//    }
//}
