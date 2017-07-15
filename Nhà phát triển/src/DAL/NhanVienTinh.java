
package DAL;


import BLL.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class NhanVienTinh {

    public static Connection conn = Connect.getConnect();
    public  static PreparedStatement pst = null;
    public static ResultSet rs=null;
    public static  void InsertNV(String MaNV, String HoTenNV,String DiaChi,String SDT,String NgayVaolam,String LuongCB,String NgaySinh,String CMND)
    {
         String sql ="INSERT INTO QCF.dbo.NhanVien (MaNV , HoTenNV,DiaChi, SDT, NgayVaoLam,LuongCB,NgaySinh,CMND) VALUES (?, ? , ? , ?,?,?,?,?)";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.setString(1, MaNV);
            pst.setString(2, HoTenNV);
            pst.setString(3, DiaChi);
            pst.setString(4, SDT);
             pst.setString(5, NgayVaolam);
            pst.setString(6, LuongCB);
            pst.setString(7, NgaySinh);
            pst.setString(8, CMND);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm Nhan vien "+MaNV+" thành công","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Mã Nhan Vien "+MaNV+" đã tồn tại không thể thêm","Thông báo",1);
        }
      
    }
public  static  void UpdateNV(String MaNV1,String MaNV, String HoTenNV,String DiaChi,String SDT,String NgayVaolam,String LuongCB,String NgaySinh,String CMND)
    {
        String sql="UPDATE QCF.dbo.NhanVien SET MaNV ='"+ MaNV +"',HoTenNV=N'"+ HoTenNV +"',DiaChi='"+ DiaChi +"',SDT='"+ SDT +"',NgayVaoLam='"+ NgayVaolam +"',LuongCB='"+ LuongCB +"',NgaySinh='"+ NgaySinh +"',CMND='"+ CMND +"'WHERE MaNV='"+ MaNV1 +"'";
        try
        {
            pst= conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lớp "+MaNV1+" đã sửa thành "+MaNV+" thành công","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lớp "+MaNV1+"có thể  đã tồn tại trước đó không thể sửa","Thông báo",1);
        }
    }
    public static void DeleteNV(String MaNV)
    {
        String sql ="DELETE FROM QCF.dbo.NhanVien WHERE MaNV = '"+ MaNV +"'";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Lớp "+MaNV+" đã được xóa ","Thông báo",1);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lớp "+MaNV+" có thể được sử dụng ở thực thể khác nên không thể xóa ","Thông báo",1);
        }
    }

 
}
