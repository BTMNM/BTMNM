
package DAL;

import BLL.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class TinhNl {
    public static Connection conn = Connect.getConnect();
    public  static PreparedStatement pst = null;
    public static ResultSet rs=null;
    public static  void InsertNL(String MaLoai, String TenLoai , String DonGia , String DVT )
    {
        String sql ="INSERT INTO QCF.dbo.LoaiMon (MaLoai, TenLoai,DonGia, DVT) VALUES (?, ? , ? , ?)";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.setString(1, MaLoai);
            pst.setString(2, TenLoai);
            pst.setString(3, DonGia);
            pst.setString(4, DVT);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm lớp "+MaLoai+" thành công","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Mã lớp "+MaLoai+" đã tồn tại không thể thêm","Thông báo",1);
        }
    
    }
public  static  void UpdateNL(String MaLoai,String MaLoai1, String TenLoai,String DonGia,String DVT)
    {
        String sql="UPDATE QCF.dbo.LoaiMon SET MaLoai='"+MaLoai+"', TenLoai='"+TenLoai+"',DonGia='"+DonGia+"', DVT='"+DVT+"' WHERE MaLoai='"+MaLoai1+"'";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.execute();
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null," Nguyên Liệu  "+MaLoai1+"có thể  đã tồn tại trước đó không thể sửa","Thông báo",1);
        }
    }
    public static void DeleteNL(String MaLoai)
    {
        String sql ="DELETE FROM QCF.dbo.LoaiMon WHERE MaLoai='"+ MaLoai +"'";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lớp "+ MaLoai +" đã được xóa ","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lớp "+MaLoai+" có thể được sử dụng ở thực thể khác nên không thể xóa ","Thông báo",1);
        }
    }

}
