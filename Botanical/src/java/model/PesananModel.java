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
public class PesananModel {
    private String nama;
    private String alamat;
    private String jenisBibit;
    private int idUser;
    private int idBibit;
    private int id;
    private int jlhBibit;
    private int total;

    public PesananModel(String nama, String alamat, String jenisBibit, int jlhBibit, int total) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisBibit = jenisBibit;
        this.jlhBibit = jlhBibit;
        this.total = total;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the jenisBibit
     */
    public String getJenisBibit() {
        return jenisBibit;
    }

    /**
     * @param jenisBibit the jenisBibit to set
     */
    public void setJenisBibit(String jenisBibit) {
        this.jenisBibit = jenisBibit;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the idBibit
     */
    public int getIdBibit() {
        return idBibit;
    }

    /**
     * @param idBibit the idBibit to set
     */
    public void setIdBibit(int idBibit) {
        this.idBibit = idBibit;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the jlhBibit
     */
    public int getJlhBibit() {
        return jlhBibit;
    }

    /**
     * @param jlhBibit the jlhBibit to set
     */
    public void setJlhBibit(int jlhBibit) {
        this.jlhBibit = jlhBibit;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
