/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class StockModel {
    
    private int id;
    private String namaBibit;
    private int jumlahBibit;
    private String hargaBibit;
    
    
    public StockModel (String namaBibit, String hargaBibit){
        this.namaBibit = namaBibit;
        this.jumlahBibit = jumlahBibit;
        this.hargaBibit = hargaBibit;
    }

    public StockModel (int id, String namaBibit, String hargaBibit){
        this.id = id;
        this.namaBibit = namaBibit;
        this.jumlahBibit = jumlahBibit;
        this.hargaBibit = hargaBibit;
    }
    
    public StockModel (){
        
    }

    /**
     * @return the namaBibit
     */
    public String getNamaBibit() {
        return namaBibit;
    }

    /**
     * @param namaBibit the namaBibit to set
     */
    public void setNamaBibit(String namaBibit) {
        this.namaBibit = namaBibit;
    }

    /**
     * @return the jumlahBibit
     */
    public int getJumlahBibit() {
        return jumlahBibit;
    }

    /**
     * @param jumlahBibit the jumlahBibit to set
     */
    public void setJumlahBibit(int jumlahBibit) {
        this.jumlahBibit = jumlahBibit;
    }

    /**
     * @return the hargaBibit
     */
    public String getHargaBibit() {
        return hargaBibit;
    }

    /**
     * @param hargaBibit the hargaBibit to set
     */
    public void setHargaBibit(String hargaBibit) {
        this.hargaBibit = hargaBibit;
    }

    /**
     * @return the bibit_id
     */
    public int getId() {
        return id;
    }

    /**
     * @param bibit_id the bibit_id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the bibitID
     */


    /**
     * @param bibitID the bibitID to set
     */

    
    
    
}
