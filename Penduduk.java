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
public class Penduduk {
    private String nama;
    private String id_penduduk;
    private String alamat;
    public Dusun dusun= new Dusun();
    private int usia;
    
    
    public Penduduk(){
       
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     * @throws java.lang.Exception
     */
    public void setNama(String nama)throws Exception {
        for (char i : nama.toCharArray()){
            if(Character.isDigit(i)){
                throw new Exception ("Penulisan Nama Harus Huruf");
            }
            else {
            this.nama = nama;    
            }
        }
        
    }

    /**
     * @return the id_penduduk
     */
    public String getId_penduduk() {
        return id_penduduk;
    }

    /**
     * @param id_penduduk the id_penduduk to set
     * @throws java.lang.Exception
     */
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
     * @return the dusun
     */
    

    /**
     * @param dusun the dusun to set
     */
    public String  dusunn() {
        
        if (id_penduduk.charAt(5)=='1'){
            dusun.setNamaDusun("Dusun Bonasel");
           }
        else if(id_penduduk.charAt(5)=='2'){
            dusun.setNamaDusun("Dusun Bonasut");
        }
        else {
            dusun.setNamaDusun("Dusun Bonsay");
        }
        return(dusun.getNamaDusun());
    }

    /**
     * @return the usia
     */
    public int getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        if (usia<0){
            System.err.println("Usia Tidak Boleh Negatif");
        }
        this.usia = usia;
    }
    
    
    
   
 }
