/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11;

import java.sql.*;

/**
 *
 * @author andbayu
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try{
                String url = "jdbc:mysql://localhost/keryawan";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = (Connection) DriverManager.getConnection(url, username, password);
                
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return koneksi;
    }
}
