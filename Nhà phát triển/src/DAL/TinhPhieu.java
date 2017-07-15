/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import BLL.Connect;
import java.sql.*;
import javax.swing.*;
import javafx.scene.chart.PieChart.Data.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TinhPhieu {
     public static Connection conn = Connect.getConnect();
    public  static PreparedStatement pst = null;
    public static ResultSet rs=null;
    
    public static  void InsertPhieu(String MaPhieu, String MaLoai , String MaNV , String SoLuong, String GiamGia, String DonGia )
    {
        String sql ="INSERT INTO QCF.dbo.ChiTietPhieu (MaPhieu,MaLoai,MaNV,SoLuong,GiamGia,DonGia) VALUES (?,?,?,?,?,?)";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.setString(1, MaPhieu);
            pst.setString(2, MaLoai);
            pst.setString(3, MaNV);
            pst.setString(4, SoLuong);
            pst.setString(5, GiamGia);
            pst.setString(6, DonGia);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm lớp "+MaPhieu+" thành công","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Mã lớp "+MaPhieu+" đã tồn tại không thể thêm","Thông báo",1);
        }
    }
    public  static  void UpdatePhieu(String MaPhieu, String MaLoai,String MaNV, String SoLuong,String GiamGia,String DonGia)
    {
        String sql="UPDATE QCF.dbo.ChiTietPhieu SET MaLoai='"+MaLoai+"', MaNV='"+MaNV+"', SoLuong='"+SoLuong+"', GiamGia='"+GiamGia+"' , DonGia='"+DonGia+"'WHERE MaPhieu='"+MaPhieu+"'";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lớp  "+MaPhieu+" sửa thành công","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lớp "+MaPhieu+"có thể  đã tồn tại trước đó không thể sửa","Thông báo",1);
        }
    }
    public static void DeletePhieu(String MaPhieu)
    {
         String sql ="DELETE FROM QCF.dbo.ChiTietPhieu WHERE `MaPhieu`='"+MaPhieu+"'";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lớp "+MaPhieu+" đã được xóa ","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lớp "+MaPhieu+" có thể được sử dụng ở thực thể khác nên không thể xóa ","Thông báo",1);
        }
    }
}
