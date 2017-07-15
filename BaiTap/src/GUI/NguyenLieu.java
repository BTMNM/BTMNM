/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import DAL.TinhNl;
import DAL.Update_Data;      
import java.sql.*;
import javax.swing.*;
import java.lang.Process.*;
/**
 *
 * @author DEVIL
 */
public class NguyenLieu extends javax.swing.JFrame {

    public static  String sql ="SELECT MaLoai as 'Mã Loại', TenLoai as 'Tên loại',DonGia as 'Đơn giá', DVT FROM QCF.dbo.LoaiMon order by TenLoai asc";
    public static String MaLoai;
    
    public NguyenLieu() {
        initComponents();
        showCT();
        ProcessCrt(false);
    }
public  void showCT()
    {
        Update_Data.LoadData(sql, tabNguyenLieu);
    }
public  void ProcessCrt(boolean  b)
{

    this.btnThem.setEnabled(b);
    this.btnSua.setEnabled(b);
    this.btnXoa.setEnabled(b);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtDVT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabNguyenLieu = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã Loại");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(txtMaLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, -1));

        jLabel2.setText("Tên loại");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("THÔNG TIN NGUYÊN LIỆU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel4.setText("Đơn Giá");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel5.setText("ĐVT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));
        getContentPane().add(txtTenLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));
        getContentPane().add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 130, -1));
        getContentPane().add(txtDVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, -1));

        tabNguyenLieu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabNguyenLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNguyenLieuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabNguyenLieu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 120));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 60, -1));

        btnReset.setText("Cập Nhật");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
          if(this.txtMaLoai.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã loại không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaLoai.getText().length()>10)
                JOptionPane.showMessageDialog(null, "Mã loại không được vượt quá 10 ký tự","Thông báo",1);
        else
                if(this.txtTenLoai.getText().length()==0)
                    JOptionPane.showMessageDialog(null, "Tên loại không được bỏ trống","Thông báo",1);
        else
                {
                 TinhNl.InsertNL(this.txtMaLoai.getText().trim(), this.txtTenLoai.getText(),this.txtDonGia.getText(),this.txtDVT.getText());
                 showCT();
                    ProcessCrt(false);
                }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tabNguyenLieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNguyenLieuMouseClicked
       ProcessCrt(true);
        this.btnThem.setEnabled(true);
        try
        {
            int row = this.tabNguyenLieu.getSelectedRow(); // lấy dòng hiện tại mình đang nhấn chuột
            String IDrow = (this.tabNguyenLieu.getModel().getValueAt(row, 0)).toString(); // Lấy giá trị ở dòng i vừa nhấn
            //và lấy giá trị đó đổi ra String. VD ta lấy dc giá trị là TH4
            String sql1 ="SELECT * FROM QCF.dbo.LoaiMon where MaLoai='"+IDrow+"'";
            ResultSet rs = Update_Data.ShowTextField(sql1);
            // dọc dữ liệu tại dòng có mã TH4
            if(rs.next())//nếu có dữ liệu
            {
                MaLoai = rs.getString("MaLoai");
                this.txtMaLoai.setText(rs.getString("MaLoai"));
                this.txtTenLoai.setText(rs.getString("TenLoai"));
                this.txtDonGia.setText(rs.getString("DonGia"));
                this.txtDVT.setText(rs.getString("DVT"));
            }
                
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_tabNguyenLieuMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
      if(this.txtMaLoai.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn lớp để xóa","Thông báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa lớp "+ MaLoai+ " hay không?", "Thông báo",2)==0)
                TinhNl.DeleteNL(MaLoai);
                showCT();
                 ProcessCrt(false);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.btnThem.setEnabled(true);
        if(this.txtMaLoai.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã loại không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaLoai.getText().length()>10)
                JOptionPane.showMessageDialog(null, "Mã loại không được vượt quá 10 ký tự","Thông báo",1);
        else
                if(this.txtTenLoai.getText().length()==0)
                    JOptionPane.showMessageDialog(null, "Tên loại không được bỏ trống","Thông báo",1);
        else
                {
                    // các bạn còn nhớ biến tạm manv lúc này không? giờ là lúc ta dùng đến nó
                 TinhNl.UpdateNL(MaLoai, this.txtMaLoai.getText().trim(),this.txtTenLoai.getText(),this.txtDonGia.getText(),this.txtDVT.getText());
                 showCT();
                 ProcessCrt(false);
                }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
         ProcessCrt(false);
        this.btnThem.setEnabled(true);
        this.txtMaLoai.setText(null);
        this.txtTenLoai.setText(null);
        this.txtDonGia.setText(null);
        this.txtDVT.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        this.setVisible(false);
        TrangChu tc=new TrangChu();
        tc.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(NguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguyenLieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabNguyenLieu;
    private javax.swing.JTextField txtDVT;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables

}
