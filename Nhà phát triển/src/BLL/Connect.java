/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVIL
 */
public class Connect {
   public static Connection getConnect()
    {
        try
        {
         //   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:7210;dataName=QCF;user=sa;password=123456");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Kết nối cơ sở dữ liệu thất bại","Thông báo",1);
            return null;
        }
    }
  // public static void main(String[] args) {
  //    System.out.println(getConnect());
    //}
        
}
