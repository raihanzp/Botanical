/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class DBConnection {
    private Connection connection = null;
        public Connection setConnection(){
            try{
                String url = "jdbc:mysql://localhost:3306/botanical";
                String user = "root";
                String pass ="";
                String db ="botanical";
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, pass);
                
            } catch (ClassNotFoundException | SQLException e){
                
            }
            return connection;
    }
}
