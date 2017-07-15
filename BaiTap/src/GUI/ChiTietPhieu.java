
package GUI;

import DAL.NhanVienTinh;
import DAL.TinhPhieu;
import DAL.Update_Data;
import DAL.Update_Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVIL
 */
public class ChiTietPhieu extends javax.swing.JFrame {

    public static  String sql ="SELECT MaPhieu as 'Mã Phiếu',MaLoai as 'Mã loại',MaNV as ' Mã NV',SoLuong as 'Số lượng',GiamGia as 'Giảm giá',DonGia as 'Đơn giá' FROM QCF.dbo.ChiTietPhieu";
    public static String MaPhieu;
    
    public ChiTietPhieu() {
        initComponents();
        showCT();
        ProcessCrt(false);
  
    }
public  void showCT()
    {
        Update_Data.LoadData(sql, tabChiTietPhieu);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtGiamGia = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabChiTietPhieu = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbTenNV = new javax.swing.JComboBox<>();
        txtMaPhieu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbMaLoai = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã Loại");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        getContentPane().add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, -1));

        jLabel2.setText("Số lượng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("CHI TIẾT PHIẾU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setText("Giảm giá");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel5.setText("Tên NV");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        getContentPane().add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, -1));
        getContentPane().add(txtGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 130, -1));

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 80, -1));

        tabChiTietPhieu.setModel(new javax.swing.table.DefaultTableModel(
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
        tabChiTietPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabChiTietPhieuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabChiTietPhieu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 500, 120));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 80, -1));

        jLabel6.setText("Giá");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        cbTenNV.setModel(cbTenNV.getModel());
        cbTenNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTenNVMouseClicked(evt);
            }
        });
        getContentPane().add(cbTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 120, -1));
        getContentPane().add(txtMaPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, -1));

        jLabel7.setText("Mã Phiếu");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        cbMaLoai.setModel(cbMaLoai.getModel());
        cbMaLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMaLoaiMouseClicked(evt);
            }
        });
        cbMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaLoaiActionPerformed(evt);
            }
        });
        getContentPane().add(cbMaLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));

        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public  void ProcessCrt(boolean  b)
{

    this.btnThem.setEnabled(b);
    this.btnSua.setEnabled(b);
    this.btnXoa.setEnabled(b);
}
public void load_jCB() throws SQLException
{
    String sql=" Select * From QCF.dbo.NhanVien ";
    try
    {
        PreparedStatement pst=Update_Data.conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            this.cbTenNV.addItem(rs.getString("MaNV"));
        }
    }
    catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e,"thông báo lỗi",1);
            }
}
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(this.txtMaPhieu.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã Phiếu không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaPhieu.getText().length()>10)
                JOptionPane.showMessageDialog(null, "Mã Phiếu không được vượt quá 10 ký tự","Thông báo",1);
        //else
         //       if(this.cbTenNV.getSelectedItem()=="")
        //            JOptionPane.showMessageDialog(null, "Tên loại không được bỏ trống","Thông báo",1);
        else
                {
                 TinhPhieu.InsertPhieu(this.txtMaPhieu.getText().trim(), (String) this.cbMaLoai.getSelectedItem(),(String) this.cbTenNV.getSelectedItem(),this.txtSoLuong.getText(),this.txtDonGia.getText(),this.txtGiamGia.getText());
                 showCT();
                    ProcessCrt(false);
                }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tabChiTietPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabChiTietPhieuMouseClicked

            ProcessCrt(true);
        
            this.btnThem.setEnabled(true);
            try
            {
                int row = this.tabChiTietPhieu.getSelectedRow(); // lấy dòng hiện tại mình đang nhấn chuột
                String IDrow = (this.tabChiTietPhieu.getModel().getValueAt(row, 0)).toString(); // Lấy giá trị ở dòng i vừa nhấn
                //và lấy giá trị đó đổi ra String. VD ta lấy dc giá trị là TH4
                String sql1 ="SELECT * FROM QCF.dbo.ChiTietPhieu where MaPhieu='"+IDrow+"'";
                ResultSet rs = Update_Data.ShowTextField(sql1);
                // dọc dữ liệu tại dòng có mã TH4
                if(rs.next())//nếu có dữ liệu
                {
                    String MaPhieu = rs.getString("MaPhieu");
                    this.txtMaPhieu.setText(rs.getString("MaPhieu"));
                    this.cbMaLoai.addItem(rs.getString("MaLoai"));
                    this.txtSoLuong.setText(rs.getString("SoLuong"));
                    this.txtGiamGia.setText(rs.getString("GiamGia"));
                    this.txtDonGia.setText(rs.getString("DonGia"));
                    this.cbTenNV.addItem(rs.getString("MaNV"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            } 
    }//GEN-LAST:event_tabChiTietPhieuMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        ProcessCrt(false);
        this.btnThem.setEnabled(true);
        this.txtMaPhieu.setText(null);
        this.txtSoLuong.setText(null);
        this.txtGiamGia.setText(null);
        this.txtDonGia.setText(null);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
         if(this.txtMaPhieu.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã Phiếu không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaPhieu.getText().length()>5)
                JOptionPane.showMessageDialog(null, "Mã phiếu không được vượt quá 5 ký tự","Thông báo",1);
         else
                {
                 TinhPhieu.UpdatePhieu(this.txtMaPhieu.getText().trim(), (String) this.cbMaLoai.getSelectedItem(), (String) this.cbTenNV.getSelectedItem(),this.txtSoLuong.getText(),this.txtGiamGia.getText(), this.txtDonGia.getText());
                 showCT();
   
                 ProcessCrt(false);
                }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         if(this.txtMaPhieu.getText().length()==0)
           JOptionPane.showMessageDialog(null, "Bạn cần chọn lớp để xóa","Thông báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa phiếu "+ MaPhieu+ " hay không?", "Thông báo",2)==0)
                TinhPhieu.DeletePhieu(MaPhieu);
                showCT();
                 ProcessCrt(false);
        }
       // }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbTenNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenNVMouseClicked
        String sql=" Select * From QCF.dbo.NhanVien ";
    try
    {
        PreparedStatement pst=Update_Data.conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            this.cbTenNV.addItem(rs.getString("MaNV"));
        }
    }
    catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e,"thông báo lỗi",1);
            }
    }//GEN-LAST:event_cbTenNVMouseClicked

    private void cbMaLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMaLoaiMouseClicked
        String sql=" Select * From QCF.dbo.LoaiMon ";
    try
    {
        PreparedStatement pst=Update_Data.conn.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            this.cbMaLoai.addItem(rs.getString("MaLoai"));
        }
    }
    catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e,"thông báo lỗi",1);
            }
    }//GEN-LAST:event_cbMaLoaiMouseClicked

    private void cbMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaLoaiActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       this.setVisible(false);
        TrangChu tc=new TrangChu();
        tc.setVisible(true);
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietPhieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietPhieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaLoai;
    private javax.swing.JComboBox<String> cbTenNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabChiTietPhieu;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
