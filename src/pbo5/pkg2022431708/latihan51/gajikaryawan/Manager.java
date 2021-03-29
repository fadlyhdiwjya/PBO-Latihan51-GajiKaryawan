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
public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int kehadiran) {
        return tunjanganKehadiran = kehadiran * 1000;
    }

    public float tunjanganJabatan(String jabatan) {
        switch (jabatan.toLowerCase()) {
            case "manager":
                tunjanganJabatan = 2000000;
                break;
            case "kabag":
                tunjanganJabatan = 1000000;
                break;

            default:
                tunjanganJabatan = 0;
                break;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;

            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
                 default :
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    
    
    public float totalGaji(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
