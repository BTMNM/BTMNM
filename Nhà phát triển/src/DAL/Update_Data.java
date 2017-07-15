/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import BLL.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javafx.scene.chart.PieChart.Data.*;

import net.proteanit.sql.*;
/**
 *
 * @author DEVIL
 */
public class Update_Data {
    public  static  PreparedStatement pst=null; 
    public  static ResultSet rs = null; 
    public  static  Connection conn =Connect.getConnect(); 
    
    //viết 1 hàm nạp dữ liệu cho bản
    public static void LoadData(String sql, JTable tb)
    {
        try
        {
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e,"Thông báo lỗi",1);
        }
    }
   
    public static ResultSet ShowTextField(String sql)
    {
        try
        {
            pst= conn.prepareStatement(sql);
            return pst.executeQuery();
        }
        catch(Exception e)
        {
            return null;
        }
        
    }
}

