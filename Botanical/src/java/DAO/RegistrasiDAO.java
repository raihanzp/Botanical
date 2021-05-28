/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.RegistrasiModel;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class RegistrasiDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public void insertData(RegistrasiModel data){
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into user(nama,email, password, alamat) values(?,?,?,?)");
            ps.setString(1, data.getNama());
            ps.setString(2, data.getEmail());
            ps.setString(3, data.getPassword());
            ps.setString(4,data.getAlamat());
            
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println(e);
        }
        
    }
}
