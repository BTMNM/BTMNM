/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.NhanVienTinh;
import DAL.Update_Data;      
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
public class NhanVien extends javax.swing.JFrame {

    public static  String sql ="SELECT  MaNV as N'Mã NV', HoTenNV as 'Họ tên NV',DiaChi as ' Địa chỉ', SDT , NgayVaoLam as ' Ngày vào làm',LuongCB as'Lương cơ bản',NgaySinh as 'Ngày sinh',CMND FROM QCF.dbo.NhanVien ";
    public static String MaNV;
    public NhanVien() {
        initComponents();
        Update_Data.LoadData(sql, tabNhanVien);
    }
    public void windowClosing(WindowEvent e)
{ this.setVisible(false);
    TrangChu tc=new TrangChu();
tc.setVisible(true);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtHoTenNV = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        txtLuongCB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabNhanVien = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        btnQuaylai = new javax.swing.JButton();
        lblNV = new javax.swing.JLabel();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ngày sinh");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("THÔNG TIN NHÂN VIÊN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel3.setText("SĐT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel4.setText("Mã nhân viên");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel5.setText("Họ tên NV");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel6.setText("Địa chỉ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel7.setText("Ngày vào làm");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel8.setText("Lương CB");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));
        getContentPane().add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 120, -1));
        getContentPane().add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 120, -1));
        getContentPane().add(txtHoTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 120, -1));
        getContentPane().add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 120, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 120, -1));
        getContentPane().add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 120, -1));
        getContentPane().add(txtLuongCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, -1));

        tabNhanVien.setModel(new javax.swing.table.DefaultTableModel(
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
        tabNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabNhanVien);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 730, 120));

        btnReset.setText("Cập Nhật");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 80, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 80, -1));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 70, -1));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 80, -1));

        jLabel10.setText("CMMN");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));
        getContentPane().add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 120, -1));

        btnQuaylai.setText("Quay Lại");
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        lblNV.setText("Tổng nhân viên");
        getContentPane().add(lblNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public  void ProcessCrt(boolean  b)
{

    this.btnThem.setEnabled(b);
    this.btnSua.setEnabled(b);
    this.btnXoa.setEnabled(b);
}
public  void showCT()
    {
        Update_Data.LoadData(sql, tabNhanVien);
        this.lblNV.setText("Tổng cố có "+ this.tabNhanVien.getRowCount()+ " lớp học");
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       if(this.txtMaNV.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã NV không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaNV.getText().length()>10)
                JOptionPane.showMessageDialog(null, "Mã NV không được vượt quá 10 ký tự","Thông báo",1);
        else
                if(this.txtHoTenNV.getText().length()==0)
                    JOptionPane.showMessageDialog(null, "Tên NV không được bỏ trống","Thông báo",1);
        else
                {
                 NhanVienTinh.InsertNV(this.txtMaNV.getText().trim(), this.txtHoTenNV.getText(), this.txtDiaChi.getText(), this.txtSDT.getText(), this.txtNgay.getText(), this.txtLuongCB.getText(), this.txtNgaySinh.getText(), this.txtCMND.getText());
                 showCT();
                    ProcessCrt(false);
                }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tabNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNhanVienMouseClicked

          ProcessCrt(true);
        
            this.btnThem.setEnabled(true);
            try
            {
                int row = this.tabNhanVien.getSelectedRow();
                String IDrow = (this.tabNhanVien.getModel().getValueAt(row, 0)).toString(); 
                String sql1 ="SELECT * FROM QCF.dbo.NhanVien where MaNV='"+IDrow+"'";
                ResultSet rs = Update_Data.ShowTextField(sql1);
                if(rs.next())
                {
                    MaNV = rs.getString("MaNV");
                    this.txtMaNV.setText(rs.getString("MaNV"));
                    this.txtHoTenNV.setText(rs.getString("HoTenNV"));
                    this.txtDiaChi.setText(rs.getString("DiaChi"));
                    this.txtSDT.setText(rs.getString("SDT"));
                    this.txtNgay.setText(rs.getString("NgayVaoLam"));
                    this.txtLuongCB.setText(rs.getString("LuongCB"));
                    this.txtNgaySinh.setText(rs.getString("NgaySinh"));
                    this.txtCMND.setText(rs.getString("CMND"));
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            } 
    }//GEN-LAST:event_tabNhanVienMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       if(this.txtMaNV.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Mã NV không được bỏ trống","Thông báo",1);
        else
            if(this.txtMaNV.getText().length()>10)
                JOptionPane.showMessageDialog(null, "Mã NV không được vượt quá 10 ký tự","Thông báo",1);
        else
                if(this.txtHoTenNV.getText().length()==0)
                    JOptionPane.showMessageDialog(null, "Tên NV không được bỏ trống","Thông báo",1);
        else
                {
                 NhanVienTinh.UpdateNV(MaNV,this.txtMaNV.getText().trim(), this.txtHoTenNV.getText(), this.txtDiaChi.getText(), this.txtSDT.getText(), this.txtNgay.getText(), this.txtLuongCB.getText(), this.txtNgaySinh.getText(), this.txtCMND.getText());
                 showCT();
                 ProcessCrt(false);
                }
    }                                      

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(this.txtMaNV.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn lớp để xóa","Thông báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa lớp "+ MaNV+ " hay không?", "Thông báo",2)==0)
                NhanVienTinh.DeleteNV(MaNV);
                showCT();
                 ProcessCrt(false);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
          ProcessCrt(false);
        this.btnThem.setEnabled(true);
        this.txtMaNV.setText(null);
        this.txtHoTenNV.setText(null);
        this.txtDiaChi.setText(null);
        this.txtSDT.setText(null);
        this.txtNgay.setText(null);
        this.txtLuongCB.setText(null);
        this.txtNgaySinh.setText(null);
        this.txtCMND.setText(null);
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(this.txtMaNV.getText().length()==0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn lớp để xóa","Thông báo",1);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa lớp "+ MaNV+ " hay không?", "Thông báo",2)==0)
                NhanVienTinh.DeleteNV(MaNV);
                showCT();
                 ProcessCrt(false);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        this.setVisible(false);
        TrangChu tc=new TrangChu();
        tc.setVisible(true);
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuaylai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNV;
    private javax.swing.JTable tabNhanVien;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTenNV;
    private javax.swing.JTextField txtLuongCB;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables


}
