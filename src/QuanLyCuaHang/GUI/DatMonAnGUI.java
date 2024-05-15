package QuanLyCuaHang.GUI;

import QuanLyCuaHang.BUS.SanPhamBUS;
import QuanLyCuaHang.DTO.SanPhamDTO;
import doanquanlycuahang.MyDialog;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class DatMonAnGUI extends javax.swing.JFrame {
    public static SanPhamBUS spBUS = new SanPhamBUS(); //Để thao tác với bảng dữ liệu 
    public static SanPhamDTO spDTO = new SanPhamDTO(); //Biến này đại diện cho khách hàng được chọn trong table
    public ArrayList<SanPhamDTO> giohang = new ArrayList<>();
    
    public DatMonAnGUI() {
        initComponents();
        spBUS = new SanPhamBUS();
        spDTO = new SanPhamDTO();
        giohang = new ArrayList<>();
        this.setLocationRelativeTo(null);
        jTSanPham.setRowHeight(30);
        jTGioHang.setRowHeight(25);
        upDTB();
    }
    
    //Load DTB lên Table
    public static void upDTB(){
        DefaultTableModel RecordTable = (DefaultTableModel)jTSanPham.getModel();
        RecordTable.setRowCount(0);
        spBUS.getListSanPham();
        
        for (SanPhamDTO sptemp : spBUS.listSanPham){
            RecordTable.addRow(new Object[]{sptemp.maSP,sptemp.tenSP,sptemp.maLoai,sptemp.soLuong,sptemp.donViTinh,sptemp.donGia});
        }
    }
        
//    public static void AddRowToJTable(Object[] dataRow)
//    {
//        DefaultTableModel model = (DefaultTableModel)jTDatMon.getModel();
//        model.addRow(dataRow);
//    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPBody = new javax.swing.JPanel();
        jPContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSanPham = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBRefesh = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jBTimkiem = new javax.swing.JButton();
        jBThem = new javax.swing.JButton();
        jBXoa = new javax.swing.JButton();
        jBSua = new javax.swing.JButton();
        jTSoLuongDat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTGioHang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jBNhanVien = new javax.swing.JButton();
        jBKhuyenMai = new javax.swing.JButton();
        jBSanPham = new javax.swing.JButton();
        jBBanHang = new javax.swing.JButton();
        jBKhachHang = new javax.swing.JButton();
        jBNhapHang = new javax.swing.JButton();
        jBThongKe = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
        jBHoaDon = new javax.swing.JButton();
        jPHeader = new javax.swing.JPanel();
        jLNameapp = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mác Đô Nan");

        jPBody.setBackground(new java.awt.Color(255, 255, 255));

        jTSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTSanPham.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Mã loại", "Số lượng", "Đơn vị tính", "Đơn giá"
            }
        ));
        jTSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSanPham);

        jBRefesh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reset.png"))); // NOI18N
        jBRefesh.setText("Refresh");
        jBRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefeshActionPerformed(evt);
            }
        });

        txtTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jBTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchicon.png"))); // NOI18N
        jBTimkiem.setText("Tìm kiếm");
        jBTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTimkiemActionPerformed(evt);
            }
        });

        jBThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addicon.png"))); // NOI18N
        jBThem.setText(" Thêm");
        jBThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBThemActionPerformed(evt);
            }
        });

        jBXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delicon.png"))); // NOI18N
        jBXoa.setText(" Xóa");
        jBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXoaActionPerformed(evt);
            }
        });

        jBSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/thanhtoan.png"))); // NOI18N
        jBSua.setText("Thanh toán");
        jBSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSuaActionPerformed(evt);
            }
        });

        jTSoLuongDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSoLuongDatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTSoLuongDat, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jBSua, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTSoLuongDat))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jBThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jBRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(1, 1, 1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTimkiem)))
                .addContainerGap())
        );

        jTGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Giá"
            }
        ));
        jScrollPane2.setViewportView(jTGioHang);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tổng tiền:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cart.png"))); // NOI18N
        jLabel1.setText("Giỏ Hàng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(576, 576, 576)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPMenu.setBackground(new java.awt.Color(204, 0, 0));

        jBNhanVien.setBackground(new java.awt.Color(153, 0, 0));
        jBNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jBNhanVien.setText("Nhân viên");
        jBNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBNhanVien.setPreferredSize(new java.awt.Dimension(125, 20));
        jBNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNhanVienActionPerformed(evt);
            }
        });

        jBKhuyenMai.setBackground(new java.awt.Color(153, 0, 0));
        jBKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        jBKhuyenMai.setText("Khuyến mãi");
        jBKhuyenMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 20));
        jBKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKhuyenMaiActionPerformed(evt);
            }
        });

        jBSanPham.setBackground(new java.awt.Color(153, 0, 0));
        jBSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBSanPham.setForeground(new java.awt.Color(255, 255, 255));
        jBSanPham.setText("Sản phẩm");
        jBSanPham.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSanPhamActionPerformed(evt);
            }
        });

        jBBanHang.setBackground(new java.awt.Color(0, 102, 0));
        jBBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBBanHang.setForeground(new java.awt.Color(255, 255, 255));
        jBBanHang.setText("Đặt món");
        jBBanHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBanHangActionPerformed(evt);
            }
        });

        jBKhachHang.setBackground(new java.awt.Color(153, 0, 0));
        jBKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jBKhachHang.setText("Khách hàng");
        jBKhachHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKhachHangActionPerformed(evt);
            }
        });

        jBNhapHang.setBackground(new java.awt.Color(153, 0, 0));
        jBNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        jBNhapHang.setText("Nhập hàng");
        jBNhapHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBThongKe.setBackground(new java.awt.Color(153, 0, 0));
        jBThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jBThongKe.setText("Thống kê");
        jBThongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo(1).png"))); // NOI18N

        jBHoaDon.setBackground(new java.awt.Color(153, 0, 0));
        jBHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jBHoaDon.setText("Hóa đơn");
        jBHoaDon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBKhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        jPHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPHeader.setForeground(new java.awt.Color(255, 0, 0));

        jLNameapp.setBackground(new java.awt.Color(255, 255, 255));
        jLNameapp.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLNameapp.setForeground(new java.awt.Color(255, 0, 0));
        jLNameapp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNameapp.setText("Phần mềm quản lý cửa hàng Mác Đô Nan");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLNameapp, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addComponent(jLNameapp, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPBodyLayout = new javax.swing.GroupLayout(jPBody);
        jPBody.setLayout(jPBodyLayout);
        jPBodyLayout.setHorizontalGroup(
            jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBodyLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBodyLayout.createSequentialGroup()
                        .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPBodyLayout.setVerticalGroup(
            jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBodyLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPBody, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBanHangActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new DatMonAnGUI().setVisible(true);
    }//GEN-LAST:event_jBBanHangActionPerformed

    private void jBSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSanPhamActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SanPhamGUI().setVisible(true);
    }//GEN-LAST:event_jBSanPhamActionPerformed

    private void jBKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBKhuyenMaiActionPerformed

    private void jBNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNhanVienActionPerformed
        this.dispose();
        new NhanVienGUI().setVisible(true);
    }//GEN-LAST:event_jBNhanVienActionPerformed

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void jBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXoaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jBXoaActionPerformed

    private void jBThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBThemActionPerformed
        //Ý tưởng là tạo một mảng giohang, nếu sản phẩm đã tồn tại thì update lại số lượng, nếu chưa thì thêm một đối tượng mới vào mảng giohang
        //spDTO là sản phẩm được bấm vào trong bảng jTSanPham
        //Tạo một spDTOtemp là bản sao chép của spDTO để có thay đổi gì thì spDTO không bị đổi 
        SanPhamDTO spDTOtemp = new SanPhamDTO(spDTO.maSP, spDTO.tenSP, spDTO.maLoai, spDTO.soLuong, spDTO.donViTinh, spDTO.hinhAnh, spDTO.donGia);
        
        int sld = 0, slkho = spDTO.getSoLuong(); 
        //sld là số trong txtField, khai báo bằng 0 ở đây và lát mới gán giá trị của txtField nhằm catch lỗi
        //slkho là số lượng sản phẩm kho còn
        
        boolean flagC = false; //Biến này là biến xét coi có thêm thành công vào giỏ hay không
        //Nếu thêm thất bại thì flagC trả false
        //Nếu thành công thì load lại jTable dựa vào mảng giỏ hàng
        
        //Kiểm tra chọn đối tượng chưa
        if (spDTOtemp.tenSP == null) {
            new MyDialog("Chưa chọn đối tượng!", MyDialog.ERROR_DIALOG);
        } 
        //Kiểm tra nhập số lượng chưa
        else if (jTSoLuongDat.getText().trim().isEmpty()) {
            new MyDialog("Nhập số lượng!", MyDialog.ERROR_DIALOG);
        } else {
            
            // Kiểm tra đã nhập số lượng hợp lệ chưa
            try {
                sld = Integer.parseInt(jTSoLuongDat.getText().trim()); //Số lượng nhập ở cái khung txt
                //Khai báo sld ở đây do khai báo ở trên không catch lỗi "nhập số lượng không hợp lệ" được
                if (sld <= 0) {
                    throw new NumberFormatException("Số lượng phải lớn hơn 0");
                } else flagC = true;
                //Đánh dấu đã nhập đúng số lượng, các bước thêm vào đã đầy đủ
            } catch (NumberFormatException e) {
                new MyDialog("Số lượng nhập vào không hợp lệ!", MyDialog.ERROR_DIALOG);
            }
        }
        //flagC tới đây true tức là chưa làm sai cú pháp thêm sản phẩm
        
        
        //Xử lý việc thêm vào khi flagC ở trên thành công
        if (giohang.isEmpty() == false && flagC) { //Đây là xử lý thêm lần thứ 2 trở đi
            boolean found = false; //Biến kiểm tra sản phẩm thêm vào có trùng không
            for (SanPhamDTO giohangtemp : giohang) {
                //Xử lý có sản phẩm có mã sản phẩm trong giỏ hàng rồi tức là đã được thêm vào trước đó
                //Thực hiện cộng dồn thay vì add đối tượng mới vào mảng giohang
                if (giohangtemp.maSP == spDTOtemp.maSP) {
                    int sldNew = giohangtemp.soLuong + sld; 
                    if (sldNew > slkho) { //Check xem sau khi cộng dồn có nhiều hơn kho hay không
                        new MyDialog("Số lượng hàng trong kho không đủ!", MyDialog.ERROR_DIALOG);
                        flagC = false;
                        break;
                    }
                    giohangtemp.setSoLuong(sldNew);
                    found = true; //Trả true, cộng dồn số lượng thành công, không tạo đối tượng mới add vào mảng
                    break;
                }
            }
            //Xử lý sản phẩm chưa được thêm vào
            if (flagC && !found) { 
                if (sld > slkho) {
                    new MyDialog("Số lượng hàng trong kho không đủ!", MyDialog.ERROR_DIALOG);
                    flagC = false;
                } else {
                    //Tạo đối tượng mới rồi add vào là được
                    spDTOtemp.soLuong = sld;
                    giohang.add(spDTOtemp);
                }
            }
        } 
        
        //Đây là xử lý thêm vào lần đầu
        else if (flagC) {
            if (sld > slkho) {
                new MyDialog("Số lượng hàng trong kho không đủ!", MyDialog.ERROR_DIALOG);
            } else {
                spDTOtemp.soLuong = sld; //spDTOtemp sẽ lưu dữ liệu soLuong định bán, vì vậy ban đầu mới phải clone ra từ thằng spDTO
                giohang.add(spDTOtemp);
            }
        }
           
        
        //Tới đây mà flagC true thì là đã thêm thành công
        //Còn false tức là nó báo dialog lỗi rồi nên không làm gì hết
        if (flagC) {
            DefaultTableModel RecordTable = (DefaultTableModel) jTGioHang.getModel();
            RecordTable.setRowCount(0);
            for (SanPhamDTO giohangtemp : giohang) {
                RecordTable.addRow(new Object[]{
                    giohangtemp.maSP,
                    giohangtemp.tenSP,
                    giohangtemp.soLuong,
                    giohangtemp.donGia * giohangtemp.soLuong
                });
            }
            jTSoLuongDat.setText(""); //Reset lại txt nhập số lượng sau khi thêm thành công
        }
    }//GEN-LAST:event_jBThemActionPerformed

    private void jTSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSanPhamMouseClicked
        //Lấy thông tin object khi click chuột vào 
        DefaultTableModel RecordTable = (DefaultTableModel) jTSanPham.getModel();
        int SelectedRows = jTSanPham.getSelectedRow();
        spDTO.maSP = (Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString()));
        spDTO.tenSP = (RecordTable.getValueAt(SelectedRows, 1).toString());
        spDTO.maLoai = (Integer.parseInt(RecordTable.getValueAt(SelectedRows, 2).toString()));
        spDTO.soLuong = (Integer.parseInt(RecordTable.getValueAt(SelectedRows, 3).toString()));
        spDTO.donViTinh = (RecordTable.getValueAt(SelectedRows, 4).toString());
        spDTO.donGia = (Integer.parseInt(RecordTable.getValueAt(SelectedRows, 5).toString()));
    }//GEN-LAST:event_jTSanPhamMouseClicked

    private void jBTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTimkiemActionPerformed
        // TODO add your handling code here:
//        if(txtTimkiem.getText().trim().equals("")){
//            upDTB();
//        } else{
//           upDTB();
//           khBUS.listKhachHang = khBUS.timKiemKhachHang(txtTimkiem.getText());
//           DefaultTableModel RecordTable = (DefaultTableModel)jTKhachHang.getModel();
//           RecordTable.setRowCount(0);
//           for (KhachHangDTO khtemp : khBUS.listKhachHang){
//           RecordTable.addRow(new Object[]{Integer.toString(khtemp.maKH),khtemp.ho,khtemp.ten,khtemp.gioiTinh,khtemp.tongChiTieu});
//           }
//        }   
    }//GEN-LAST:event_jBTimkiemActionPerformed

    private void jBSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSuaActionPerformed
        // TODO add your handling code here:
//        if (khDTO.ten == null){
//            new MyDialog("Chưa chọn đối tượng!", MyDialog.ERROR_DIALOG);
//        } else {
//            updateKhachHangGUI updateFrame = new updateKhachHangGUI();
//            updateFrame.setVisible(true);
//            updateFrame.pack();
//            updateFrame.setLocationRelativeTo(null);
//            updateFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        }
    }//GEN-LAST:event_jBSuaActionPerformed

    private void jBRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefeshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel RecordTable = (DefaultTableModel)jTGioHang.getModel();
        RecordTable.setRowCount(0);
        giohang = new ArrayList<>();
    }//GEN-LAST:event_jBRefeshActionPerformed

    private void jBKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKhachHangActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new KhachHangGUI().setVisible(true);
    }//GEN-LAST:event_jBKhachHangActionPerformed

    private void jBHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHoaDonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new HoaDonGUI().setVisible(true);
    }//GEN-LAST:event_jBHoaDonActionPerformed

    private void jTSoLuongDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSoLuongDatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSoLuongDatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DatMonAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatMonAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatMonAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatMonAnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatMonAnGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBanHang;
    private javax.swing.JButton jBHoaDon;
    private javax.swing.JButton jBKhachHang;
    private javax.swing.JButton jBKhuyenMai;
    private javax.swing.JButton jBNhanVien;
    private javax.swing.JButton jBNhapHang;
    private javax.swing.JButton jBRefesh;
    private javax.swing.JButton jBSanPham;
    private javax.swing.JButton jBSua;
    private javax.swing.JButton jBThem;
    private javax.swing.JButton jBThongKe;
    private javax.swing.JButton jBTimkiem;
    private javax.swing.JButton jBXoa;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLNameapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPBody;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTGioHang;
    static javax.swing.JTable jTSanPham;
    private javax.swing.JTextField jTSoLuongDat;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
