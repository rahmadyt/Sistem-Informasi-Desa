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
public class Pegawai {
    
    private String namaPegawai;
    private String id_pegawai;
    private String golongan;
    private String alamat;
    private String id_penduduk;
    Gaji gaji = new Gaji();

    public Pegawai(){
       
    }
    /**
     * @return the namaPegawai
     */
    public String getNamaPegawai() {
        return namaPegawai;
    }

    /**
     * @param namaPegawai the namaPegawai to set
     * @throws java.lang.Exception
     */
    public void setNamaPegawai(String namaPegawai) throws Exception {
        
        for (char i: namaPegawai.toCharArray()){
            if(Character.isLetter(i)){
                this.namaPegawai = namaPegawai;
            }
            else {
                throw new Exception("Nama Harus Huruf");
            }
        } 
        
    }

    /**
     * @return the id_pegawai
     */
    public String getId_pegawai() {
       
        return id_pegawai;
    }

    /**
     * @param id_pegawai the id_pegawai to set
     * @throws java.lang.Exception
     */
    public void setId_pegawai(String id_pegawai) throws Exception {
        for (int i=0;i<id_pegawai.length();i++){
            if(id_pegawai.charAt(4)!= '.'){
                throw new Exception("gunakan titik");
            }
            else if (Character.isLetter(i)){
                throw new Exception("tidak boleh huruf untuk id pegawai");
                    
                    }
            else {
                this.id_pegawai = id_pegawai;
            }
        }
        
    }

    /**
     * @return the golongan
     */
    public String getGolongan() {
        return golongan;
    }

    /**
     * @param golongan the golongan to set
     */
    public void setGolongan(String golongan) {
        this.golongan = golongan;
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
     * @return the id_penduduk
     */
    public String getId_penduduk() {
        return id_penduduk;
    }

    
    public void setId_penduduk(String id_penduduk)throws Exception {
        for (char i: id_penduduk.toCharArray()){
            if (Character.isLetter(i)){
                throw new Exception("id Penduduk harus angka");
                
            } 
            else {
                this.id_penduduk = id_penduduk;
            }
        }
        
        
    }
    
    
    
   

    /**
     * @return the gaji
     */
    
    
    
  
    
}
