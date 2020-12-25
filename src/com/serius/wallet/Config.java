/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serius.wallet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Config {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            
            String url = "jdbc:mysql://localhost:3306/mywallet";
            String user = "root";
            String pass = "";
                  
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi Ke database Gagal "+ e.getMessage());
        }
        return MySQLConfig;
    }
    
    public static void fconn(String sql) throws SQLException{
            java.sql.Connection conn;
            conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Success to Execute Command");  
    }
}
