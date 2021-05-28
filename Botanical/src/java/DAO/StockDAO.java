/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.StockModel;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class StockDAO {
    
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    
    public void insertStock(StockModel stock) {
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("insert into stock(nama_bibit,harga_bibit) values(?,?)");
            ps.setString(1, stock.getNamaBibit());
            ps.setString(2, stock.getHargaBibit());

            
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e){
            System.out.println(e);
        }
        
    }
    
    public void updateStock(StockModel stock){
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update stock set nama_bibit=?, harga_bibit=? where bibit_id=?");
            ps.setString(1, stock.getNamaBibit());
            ps.setString(2, stock.getHargaBibit());
            ps.setInt(3, stock.getId());
            
            ps.executeUpdate();
            
            
        } catch (SQLException e){
            System.out.println(e);
        }
        
    }
    
    public void deleteStock(int id){
       
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("DELETE FROM stock WHERE bibit_id=?");
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
        } catch (SQLException e){
            System.out.println(e);
        }
       
    }
    
     public static StockModel getStokById(int id){
         StockModel sm = null;
         try{
             conn = new DBConnection().setConnection();
             ps = conn.prepareStatement("select*from stock where bibit_id=?");
             ps.setInt(1,id);
             ResultSet rs =ps.executeQuery();
             while (rs.next()) {
                 sm = new StockModel();
                 sm.setId(rs.getInt("bibit_id"));
                 sm.setNamaBibit(rs.getString("nama_bibit"));
                 sm.setHargaBibit(rs.getString("harga_bibit"));
             }
             
         } catch(SQLException e){
             System.out.println(e);
         }
         return sm;
     }
     public List<StockModel> getAllStok()throws SQLException{
         List<StockModel> list = new ArrayList<StockModel>();
         
         try{
             conn = new DBConnection().setConnection();
              ps = conn.prepareStatement("select * from stock");
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  StockModel sm = new StockModel();
                  sm.setId(rs.getInt("bibit_id"));
                  sm.setNamaBibit(rs.getString("nama_bibit"));
                  sm.setHargaBibit(rs.getString("harga_bibit"));
                  list.add(sm);
              }
              
         } catch (SQLException e){
             System.out.println(e);
         }
         return list;
     }
        
}
