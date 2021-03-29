/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan51.gajikaryawan;

/**
 *
 * @author HP
 */
public class Karyawan {
    
    protected String nik,nama,jabatan;
    protected int golongan;
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getJabatan(){
        return jabatan;
    }
    
    public void setjabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
     public int getGolongan(){
        return golongan;
    }
    
    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
    
    
}
