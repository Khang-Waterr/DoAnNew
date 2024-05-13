package QuanLyCuaHang.GUI;

import QuanLyCuaHang.BUS.SanPhamBUS;
import QuanLyCuaHang.DTO.SanPhamDTO;
import doanquanlycuahang.MyDialog;
import javax.swing.table.DefaultTableModel;

public class SanPhamGUI extends javax.swing.JFrame {
    public static SanPhamBUS spBUS = new SanPhamBUS(); //Để thao tác với bảng dữ liệu 
    public static SanPhamDTO spDTO = new SanPhamDTO(); //Biến này đại diện cho khách hàng được chọn trong table
    
    public SanPhamGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTSanPham.setRowHeight(30);
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
    
    //Thêm dòng khi add đối tượng ở Jframe khác
    public static void AddRowToJTable(Object[] dataRow)
    {
        DefaultTableModel model = (DefaultTableModel)jTSanPham.getModel();
        model.addRow(dataRow);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBody = new javax.swing.JPanel();
        jPContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSanPham = new javax.swing.JTable();
        jBSua = new javax.swing.JButton();
        jBXoa = new javax.swing.JButton();
        jBThem = new javax.swing.JButton();
        jBTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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

        jBSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fixicon.png"))); // NOI18N
        jBSua.setText(" Sửa");
        jBSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSuaActionPerformed(evt);
            }
        });

        jBXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delicon.png"))); // NOI18N
        jBXoa.setText(" Xóa");
        jBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXoaActionPerformed(evt);
            }
        });

        jBThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addicon.png"))); // NOI18N
        jBThem.setText(" Thêm");
        jBThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBThemActionPerformed(evt);
            }
        });

        jBTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchicon.png"))); // NOI18N
        jBTimkiem.setText("Tìm kiếm");
        jBTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTimkiemActionPerformed(evt);
            }
        });

        txtTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPContentLayout.createSequentialGroup()
                        .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                            .addGroup(jPContentLayout.createSequentialGroup()
                                .addComponent(jBTimkiem)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBThem)
                                .addGap(18, 18, 18)
                                .addComponent(jBSua)
                                .addGap(18, 18, 18)
                                .addComponent(jBXoa)))
                        .addContainerGap())))
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBTimkiem)
                    .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBThem)
                        .addComponent(jBSua)
                        .addComponent(jBXoa)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jBSanPham.setBackground(new java.awt.Color(0, 102, 0));
        jBSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBSanPham.setForeground(new java.awt.Color(255, 255, 255));
        jBSanPham.setText("Sản phẩm");
        jBSanPham.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSanPhamActionPerformed(evt);
            }
        });

        jBBanHang.setBackground(new java.awt.Color(153, 0, 0));
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
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBNhapHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(jBSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jBHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jLNameapp, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addComponent(jLNameapp, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    }//GEN-LAST:event_jBSanPhamActionPerformed
        
    private void jBKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBKhuyenMaiActionPerformed

    private void jBNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNhanVienActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new NhanVienGUI().setVisible(true);
    }//GEN-LAST:event_jBNhanVienActionPerformed

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void jBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXoaActionPerformed
        // TODO add your handling code here:
//        if (khDTO.ten == null){
//            new MyDialog("Chưa chọn đối tượng!", MyDialog.ERROR_DIALOG);
//        } else {
//            khBUS.xoaKhachHang(khDTO.maKH);
//            //Reset lại đối tượng chỏ trong bảng
//            khDTO = new KhachHangDTO();
//            //Xóa xong phải load lại DTB lên Table để thể hiện xóa
//            upDTB();
//        }
    }//GEN-LAST:event_jBXoaActionPerformed

    private void jBThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBThemActionPerformed
        // TODO add your handling code here:
//        addKhachHangGUI addFrame = new addKhachHangGUI();
//        addFrame.setVisible(true);
//        addFrame.pack();
//        addFrame.setLocationRelativeTo(null);
//        addFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        
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
        spDTO.hinhAnh = (RecordTable.getValueAt(SelectedRows, 5).toString());
        spDTO.donGia = (Integer.parseInt(RecordTable.getValueAt(SelectedRows, 6).toString()));
    }//GEN-LAST:event_jTSanPhamMouseClicked

    private void jBTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTimkiemActionPerformed
        // TODO add your handling code here:
//        if(txtTimkiem.getText().trim().equals("")){
//            upDTB();
//        } else{
//           upDTB();
//           khBUS.listKhachHang = khBUS.timKiemKhachHang(txtTimkiem.getText());
//           DefaultTableModel RecordTable = (DefaultTableModel)jTSanPham.getModel();
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
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamGUI().setVisible(true);
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
    private javax.swing.JButton jBSanPham;
    private javax.swing.JButton jBSua;
    private javax.swing.JButton jBThem;
    private javax.swing.JButton jBThongKe;
    private javax.swing.JButton jBTimkiem;
    private javax.swing.JButton jBXoa;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLNameapp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBody;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTable jTSanPham;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
