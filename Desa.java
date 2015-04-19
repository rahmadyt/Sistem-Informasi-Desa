/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desa;
import java.util.*;
import java.util.ArrayList;
/**
 *
 * @author Asus-PC
 */
public class Desa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList x;
        x = new ArrayList();
        
        
        
        Dusun dusun1 = new Dusun();
        dusun1.setNamaDusun("Dusun Bonasel");
        dusun1.setJumlahPenduduk(125000);
        dusun1.setNamaKadus("Joko Widodo");
        
        Dusun dusun2 = new Dusun();
        dusun2.setNamaDusun("Dusun Bonasut");
        dusun2.setJumlahPenduduk(122906);
        dusun2.setNamaKadus("Basuki Tjahaja Purnama");
        
        Dusun dusun3 = new Dusun();
        dusun3.setNamaDusun("Dusun Bonsay");
        dusun3.setJumlahPenduduk(186579);
        dusun3.setNamaKadus("Ridwan Kamil");
        
        Pegawai pegawai2 = new Pegawai();
       try {
        pegawai2.setNamaPegawai("Adi");}
        catch (Exception e){
                System.out.println("Terjadi Eror : "+e.getMessage());
                }
        
        pegawai2.setGolongan("3a");
        try {
        pegawai2.setId_penduduk("312007890");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        try {
        pegawai2.setId_pegawai("1990.4367");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());}
        
        pegawai2.setAlamat("Jalan Swakarya No. 10");
        pegawai2.gaji.gajiTotall(2100000);
        
        
        
        
        Pegawai pegawai3 = new Pegawai();
        try {
            pegawai3.setNamaPegawai("Ita");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai3.setGolongan("3c");
        try {
            pegawai3.setId_penduduk("312006789");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        try {
            pegawai3.setId_pegawai("1970.3456");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai3.setAlamat("Jalan Sukakarya No.11");
        pegawai3.gaji.gajiTotall(2500000);
        
        Pegawai pegawai4 = new Pegawai();
        try {
            pegawai4.setNamaPegawai("Dona");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai4.setGolongan("4a");
        try {
            pegawai4.setId_penduduk("312008790");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        
        try {
            pegawai4.setId_pegawai("1965.2341");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai4.setAlamat("Jalan Temulawak No.100");
        pegawai4.gaji.gajiTotall(4159000);
        
        Pegawai pegawai5 = new Pegawai();
        try {
            pegawai5.setNamaPegawai("Antoni");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai5.setGolongan("4b");
        try {
            pegawai5.setId_penduduk("312006542");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        try {
            pegawai5.setId_pegawai("1965.6483");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        pegawai5.setAlamat("Jalan Mekar sari No.670");
        pegawai5.gaji.gajiTotall(4967890);
        
        Penduduk penduduk1 = new Penduduk();
        try {
            penduduk1.setNama("Oryza Sativa");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        penduduk1.setUsia(19);
        penduduk1.setAlamat("Jalan Cemara No.31");
        try {
            penduduk1.setId_penduduk("312001767");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        
        
        Penduduk penduduk2 = new Penduduk();
        try {
            penduduk2.setNama("Monotype Corsiva");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        penduduk2.setUsia(30);
        penduduk2.setAlamat("Jalan Terigu No.20");
        try {
            penduduk2.setId_penduduk("312002867");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        
        Penduduk penduduk3 = new Penduduk();
        try {
            penduduk3.setNama("Acetobacter Xylinum");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        penduduk3.setUsia(45);
        penduduk3.setAlamat("Jalan Teladan No.69");
        try {
            penduduk3.setId_penduduk("312003435");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        
        Surat surat1 = new Surat();
        surat1.setJudul("Surat Permohonan Perbaikan Mesjid");
        try {
            surat1.setNomor("1234");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        surat1.setTujuan("Kepala Desa");
        
        Surat surat2 = new Surat();
        surat2.setJudul("Surat Kerja Bakti");
        try {
            surat2.setNomor("2341");
        }
        catch (Exception e){
            System.out.println("Terjadi Eror : "+e.getMessage());
        }
        surat2.setTujuan("Kepala Dusun");
       
        
       System.out.println("=====================================================");
        System.out.println("Sistem Informasi Desa Suka Suka");
        while (true){
            
            System.out.println("1. Data Penduduk");
            System.out.println("2. Data Pegawai");
            System.out.println("3. Data Surat");
            System.out.println("4. Data Dusun");
            System.out.println("5. Keluar");
            System.out.println("=====================================================");
            System.out.print("Masukkan Pilihan Menu :");
            int men = sc.nextInt();
            if (men ==1){
                cetakPenduduk(penduduk1);
                cetakPenduduk(penduduk2);
                cetakPenduduk(penduduk3);
                
               
                
            }
            else if (men == 2){
                cetakPegawai(pegawai5);
                cetakPegawai(pegawai2);
                cetakPegawai(pegawai3);
                cetakPegawai(pegawai4);
                
            }
            else if (men==3){
                cetakSurat(surat1);
                cetakSurat(surat2);
            }
            else if (men ==4){
                cetakDusun(dusun1);
                cetakDusun(dusun2);
                cetakDusun(dusun3);
            }
            else if (men==5){
                break;
            }
            
          
            
        
        
        else {
            System.err.println("Ulangi!! Terjadi Kesalahan Penginputan");
        }
        
    }}
       
       
        
        

// TODO code application logic here
    
    
    public static void cetakPenduduk(Penduduk a){
        
        System.out.println("Nama    : "+a.getNama());
        System.out.println("Alamat  : "+a.getAlamat());
        System.out.println("NIK     : "+a.getId_penduduk());
        System.out.println("Usia    : "+a.getUsia());
        System.out.println("Dusun   : "+a.dusunn());
        
        System.out.println("");
    }
     public static void cetakPegawai(Pegawai a){
        
        System.out.println("Nama    : "+a.getNamaPegawai());
        System.out.println("Alamat  : "+a.getAlamat());
        System.out.println("Golongan: "+a.getGolongan());
        System.out.println("NIP     : "+a.getId_pegawai());
        System.out.println("NIK     : "+a.getId_penduduk());
        System.out.println("Gaji    : "+a.gaji.getGaji());
        
        System.out.println("");
    }
     public static void cetakSurat(Surat a){
        
        System.out.println("Judul Surat    : "+a.getJudul());
        System.out.println("Nomor Surat    : "+a.getNomor());
        System.out.println("Tujuan Surat   : "+a.getTujuan());
        System.out.println("");
    }
    
      public static void cetakDusun(Dusun a){
        
        System.out.println("Nama Dusun        : "+a.getNamaDusun());
        System.out.println("Nama Kadus        : "+a.getNamaKadus());
        System.out.println("Jumlah Penduduk   : "+a.getJumlahPenduduk()+" jiwa");
        System.out.println("");
    }
    
}
