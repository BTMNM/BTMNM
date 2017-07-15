
package DAL;
import java.sql.*;
import javax.swing.*;
import BLL.*;
import java.awt.*;
import java.awt.HeadlessException;



public class TinhCong {
    public static Connection conn = Connect.getConnect();
    public  static PreparedStatement pst = null;
    public static ResultSet rs=null;
    public static  void InsertChamCong (String MaNV, String Ngay)
    {
        String sql ="INSERT INTO QCF.dbo.ChamCong ( MaNV, Ngay ) VALUES (?,?)";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.setString(1, MaNV);
            pst.setString(2, Ngay );
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm  "+ MaNV +" thành công","Thông báo",1);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, " "+ MaNV +" đã tồn tại không thể thêm","Thông báo",1);
        }
        
    }
        public  static  void UpdateChamCong(String MaNV , String Ngay)
    {
        
        //String sql="UPDATE  QLQCF.dbo.ChamCong  SET SoNgay='"+ Ngay +"' WHERE MaNV='"+ MaNV +"'";
         String sql="UPDATE  QCF.dbo.ChamCong  SET MaNV='"+ MaNV +"',Ngay = '" + Ngay + "' WHERE Ngay='"+ Ngay +"'";
        // String sql="UPDATE QLQCF.dbo.ChamCong SET MaNV ='"+ MaNV +"'WHERE SoNgay='"+ Ngay +"'";

        try
        {
            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Nhan Vien "+ MaNV +" đã sửa thành thành công","Thông báo",1);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Nhan Vien "+ MaNV +"có thể  đã tồn tại trước đó không thể sửa","Thông báo",1);
        }
    }
    public static void DeleteChamCong(String Ngay)
    {
        String sql ="DELETE FROM QCF.dbo.ChamCong WHERE Ngay = '"+ Ngay +"'";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Nhan Vien "+Ngay+" đã được xóa ","Thông báo",1);
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Nhan Vien "+Ngay+" có thể được sử dụng ở thực thể khác nên không thể xóa ","Thông báo",1);
        }
    }
    

}
