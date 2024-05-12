package QuanLyCuaHang.BUS;

import QuanLyCuaHang.DAO.HoaDonDAO;
import QuanLyCuaHang.DTO.HoaDonDTO;
import doanquanlycuahang.MyDialog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HoaDonBUS {

    public ArrayList<HoaDonDTO> listHoaDon;
    public HoaDonDAO hoaDonDAO = new HoaDonDAO();

    public ArrayList<HoaDonDTO> getListHoaDon() {
        listHoaDon = hoaDonDAO.getListHoaDon();
        return listHoaDon;
    }

    
    public void addHoaDon(int maKH, String nhanVien, int tongTien, String ghiChu) {
        HoaDonDTO hd = new HoaDonDTO();
        String[] arrNV = nhanVien.split(" - ");
        int maNV = Integer.parseInt(arrNV[0]);
        hd.setMaNV(maNV);
        hd.setMaKH(maKH);
        hd.setGhiChu(ghiChu);
        hd.setTongTien(tongTien);
        hoaDonDAO.addHoaDon(hd);
    }

    
    public int getMaHoaDonMoiNhat() {
        return hoaDonDAO.getMaHoaDonMoiNhat();
    }

    public HoaDonDTO getHoaDon(String maHD) {
        int ma = Integer.parseInt(maHD);
        for (HoaDonDTO hd : listHoaDon) {
            if (hd.getMaHD() == ma)
                return hd;
        }
        return null;
    }

    
    public ArrayList<HoaDonDTO> getListHoaDonTheoGia(String min, String max) {
        try {
            int minPrice = Integer.parseInt(min);
            int maxPrice = Integer.parseInt(max);
            ArrayList<HoaDonDTO> dshd = new ArrayList<>();
            for (HoaDonDTO hd : listHoaDon) {
                if (hd.getTongTien() > minPrice && hd.getTongTien() < maxPrice)
                    dshd.add(hd);
            }
            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng giá hợp lệ", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

    
    public ArrayList<HoaDonDTO> getListHoaDonTheoNgay(String min, String max) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date minDate = sdf.parse(min);
            Date maxDate = sdf.parse(max);

            java.sql.Date dateMin = new java.sql.Date(minDate.getTime());
            java.sql.Date dateMax = new java.sql.Date(maxDate.getTime());

            ArrayList<HoaDonDTO> dshd = hoaDonDAO.getListHoaDon(dateMin, dateMax);
            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng ngày hợp lệ!", MyDialog.ERROR_DIALOG);
        }
        return null;
    }
}
