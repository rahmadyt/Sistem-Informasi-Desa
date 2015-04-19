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
public class Dusun {
    public String namaDusun;
    private String namaKadus;
    private int jumlahPenduduk;
    public Dusun(){
        
    }
    /**
     * @return the namaDusun
     */
    public String getNamaDusun() {
        return namaDusun;
    }

    /**
     * @param namaDusun the namaDusun to set
     */
    public void setNamaDusun(String namaDusun) {
        this.namaDusun = namaDusun;
    }

    /**
     * @return the namaKadus
     */
    public String getNamaKadus() {
        return namaKadus;
    }

    /**
     * @param namaKadus the namaKadus to set
     */
    public void setNamaKadus(String namaKadus) {
        this.namaKadus = namaKadus;
    }

    /**
     * @return the jumlahPenduduk
     */
    public int getJumlahPenduduk() {
        return jumlahPenduduk;
    }

    /**
     * @param jumlahPenduduk the jumlahPenduduk to set
     */
    public void setJumlahPenduduk(int jumlahPenduduk) {
        this.jumlahPenduduk = jumlahPenduduk;
    }
}
