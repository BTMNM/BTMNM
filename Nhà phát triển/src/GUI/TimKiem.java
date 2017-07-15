/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static DAL.NhanVienTinh.conn;
import static DAL.NhanVienTinh.pst;
import DAL.Update_Data;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVIL
 */
public class TimKiem extends javax.swing.JFrame {
        public static  String sql ="SELECT  MaNV as N'Mã NV', HoTenNV as 'Họ tên NV',DiaChi as ' Địa chỉ', SDT , NgayVaoLam as ' Ngày vào làm',LuongCB as'Lương cơ bản',NgaySinh as 'Ngày sinh',CMND FROM QCF.dbo.NhanVien ";

    public TimKiem() {
        initComponents();
        Update_Data.LoadData(sql, tabTimKiem);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabTimKiem = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTong = new javax.swing.JLabel();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTimKiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabTimKiem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 500, 110));
        getContentPane().add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 180, -1));

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel1.setText("Họ tên nhân viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        lblTong.setText("Tổng sô NV");
        getContentPane().add(lblTong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
         if(this.txtTimKiem.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập từ khóa cần tìm ","Thông báo",1);
        else
        {
            String sql1 ="SELECT * FROM QCF.dbo.NhanVien where MaNV like'%"+this.txtTimKiem.getText()+"%' or HoTenNV like '%"+this.txtTimKiem.getText()+"%'";
            Update_Data.LoadData(sql1, tabTimKiem);
            this.lblTong.setText("Có "+this.tabTimKiem.getRowCount()+" nhân viên cần tìm");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tabTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTimKiemMouseClicked
        
        this.btnTimKiem.setEnabled(true);
        try
        {
          
             
            Update_Data.LoadData(sql, tabTimKiem);
        }
            catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
                }   
    }//GEN-LAST:event_tabTimKiemMouseClicked

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.setVisible(false);
        TrangChu tc= new TrangChu();
        tc.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed
//MaNV as N'Mã NV', HoTenNV as 'Họ tên NV',DiaChi as ' Địa chỉ', SDT , NgayVaoLam as ' Ngày vào làm',LuongCB as'Lương cơ bản',NgaySinh as 'Ngày sinh',CMND FROM QLQCF.dbo.NhanVien
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
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTong;
    private javax.swing.JTable tabTimKiem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
