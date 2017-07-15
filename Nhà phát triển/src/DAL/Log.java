/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import BLL.Connect;

public class Log {
    public  static Connection conn = null;
    public static  ResultSet rs = null;
    public static PreparedStatement pst=null;
    public static String testConnect()
    {
        try
        {
            conn = Connect.getConnect();
            return "Kết nối cơ sở dữ liệu thành công";
        }
        catch(Exception e)
        {
            return "Kết nối cơ sở dữ liệu thất bại";
        }
    }
        public  static ResultSet cLog(String TenDN, String MatKhau)
        {
            String sql="SELECT * FROM QCF.dbo.DangNhap where TenDN=? and MatKhau=?";
            try
            {
            pst = conn.prepareStatement(sql);
            pst.setString(1, TenDN );
            pst.setString(2, MatKhau );
           return rs=  pst.executeQuery();
            }
            catch(Exception e)
            {
                return rs=null;
            }
        }
    
}
