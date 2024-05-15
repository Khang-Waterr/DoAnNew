package QuanLyCuaHang.GUI;

import QuanLyCuaHang.BUS.SanPhamBUS;
import QuanLyCuaHang.DTO.SanPhamDTO;

public class updateSanPhamGUI extends javax.swing.JFrame {

    SanPhamBUS spBUS = new SanPhamBUS();
    public boolean flag = false;
    
    public updateSanPhamGUI() {
        initComponents();
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTenSP = new javax.swing.JLabel();
        jLMaLoai = new javax.swing.JLabel();
        jTTenSP = new javax.swing.JTextField();
        jTMaLoai = new javax.swing.JTextField();
        jBSua = new javax.swing.JButton();
        jTDonViTinh = new javax.swing.JTextField();
        jLDonViTinh = new javax.swing.JLabel();
        jLHeader = new javax.swing.JLabel();
        jLDonGia = new javax.swing.JLabel();
        jTDonGia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm Khách Hàng");

        jLTenSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTenSP.setText("Tên sản phẩm:");

        jLMaLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLMaLoai.setText("Mã loại:");

        jBSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBSua.setText("Lưu");
        jBSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSuaActionPerformed(evt);
            }
        });

        jTDonViTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDonViTinhActionPerformed(evt);
            }
        });

        jLDonViTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDonViTinh.setText("Đơn vị tính:");

        jLHeader.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLHeader.setText("Thông Tin Sản Phẩm");

        jLDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDonGia.setText("Đơn giá:");

        jTDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDonGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDonViTinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLTenSP)
                                            .addGap(91, 91, 91))
                                        .addComponent(jLMaLoai))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLDonGia)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTMaLoai)
                                    .addComponent(jTTenSP)
                                    .addComponent(jTDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLHeader)
                        .addGap(102, 102, 102))))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jBSua)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTenSP)
                    .addComponent(jTTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMaLoai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDonViTinh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDonGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jBSua)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSuaActionPerformed
        // TODO add your handling code here:
        flag = spBUS.suaSanPham(Integer.toString(SanPhamGUI.spDTO.maSP),jTTenSP.getText(),jTMaLoai.getText(),"0", jTDonViTinh.getText(),"" ,  jTDonGia.getText());
       if (flag){
            SanPhamGUI.upDTB();
            SanPhamGUI.spDTO = new SanPhamDTO();
            this.dispose();   
        }
        
    }//GEN-LAST:event_jBSuaActionPerformed

    private void jTDonViTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDonViTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDonViTinhActionPerformed

    private void jTDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDonGiaActionPerformed

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
            java.util.logging.Logger.getLogger(updateSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateSanPhamGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new updateSanPhamGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSua;
    private javax.swing.JLabel jLDonGia;
    private javax.swing.JLabel jLDonViTinh;
    private javax.swing.JLabel jLHeader;
    private javax.swing.JLabel jLMaLoai;
    private javax.swing.JLabel jLTenSP;
    private javax.swing.JTextField jTDonGia;
    private javax.swing.JTextField jTDonViTinh;
    private javax.swing.JTextField jTMaLoai;
    private javax.swing.JTextField jTTenSP;
    // End of variables declaration//GEN-END:variables
}
