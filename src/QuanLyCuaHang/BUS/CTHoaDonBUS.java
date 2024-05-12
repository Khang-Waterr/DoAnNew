package QuanLyCuaHang.BUS;


import QuanLyCuaHang.DAO.CTHoaDonDAO;
import QuanLyCuaHang.DTO.CTHoaDonDTO;
import QuanLyCuaHang.DTO.HoaDonDTO;

import java.util.ArrayList;

public class CTHoaDonBUS {

    private ArrayList<CTHoaDonDTO> listCTHoaDon;
    private CTHoaDonDAO ctHDDAO = new CTHoaDonDAO();
    private HoaDonBUS hdBUS = new HoaDonBUS();

    public CTHoaDonBUS() {
        docListCTHoaDon();
    }

    public void docListCTHoaDon() {
        this.listCTHoaDon = ctHDDAO.getListCTHoaDon();
    }

    public ArrayList<CTHoaDonDTO> getListCTHoaDon() {
        return listCTHoaDon;
    }

    public ArrayList<CTHoaDonDTO> getListCTHoaDonTheoMaHD(String maHD) {
        int ma = Integer.parseInt(maHD);
        ArrayList<CTHoaDonDTO> dsct = new ArrayList<>();

        for (CTHoaDonDTO cthd : listCTHoaDon) {
            if (cthd.getMaHD() == ma)
                dsct.add(cthd);
        }

        return dsct;
    }

    public void addCTHoaDon(String maSP, String soLuong, String donGia, String thanhTien) {
        int ma = hdBUS.getMaHoaDonMoiNhat();

        donGia = donGia.replace(",","");
        thanhTien = thanhTien.replace(",", "");

        CTHoaDonDTO cthd = new CTHoaDonDTO	();

        cthd.setMaHD(ma);
        cthd.setMaSP(Integer.parseInt(maSP));
        cthd.setDonGia(Integer.parseInt(donGia));
        cthd.setSoLuong(Integer.parseInt(soLuong));
        cthd.setThanhTien(Integer.parseInt(thanhTien));

        ctHDDAO.addCTHoaDon(cthd);
    }
}
