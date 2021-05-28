/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.LoginModel;


/**
 *
 * @author IQBAL NOTEBOOK
 */
public class LoginDAO {

    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    
    public boolean checkUser(LoginModel login){
        boolean st = false;
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from user where email=? and password=?");
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getPassword());
            
            ResultSet rs = ps.executeQuery();
            st = rs.next();
               
        } catch (Exception e){
            e.printStackTrace();
        }
        return st;
    }
}