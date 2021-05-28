/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.PesananModel;


/**
 *
 * @author IQBAL NOTEBOOK
 */
public class PesananDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
 public void insertData(PesananModel data){
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into pesanan(nama,alamat, jenis_bibit, jumlah_bibit, total) values(?,?,?,?,?)");
            ps.setString(1, data.getNama());
            ps.setString(2, data.getAlamat());
            ps.setString(3, data.getJenisBibit());
            ps.setInt(4,data.getJlhBibit());
            ps.setInt(5, data.getTotal());
            
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println(e);
        }
        
    }
}
