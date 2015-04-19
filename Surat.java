/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desa;

/**
 *
 * @author Asus-PC
 */
public class Surat {
    private String judul;
    private String nomor;
    private String tujuan;
    public Surat(){
        
    }
    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul){
        this.judul = judul;
    }

    /**
     * @return the nomor
     */
    public String getNomor() {
        return nomor;
    }

    /**
     * @param nomor the nomor to set
     * @throws java.lang.Exception
     */
    public void setNomor(String nomor)throws Exception {
        try{
            Integer.parseInt(nomor);
        }
        catch(Exception e){
            throw new Exception("nomor harus berupa angka");
        }
        
        this.nomor = nomor;
    }

    /**
     * @return the tujuan
     */
    public String getTujuan() {
        return tujuan;
    }

    /**
     * @param tujuan the tujuan to set
     */
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}
