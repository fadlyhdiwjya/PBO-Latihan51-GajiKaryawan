package pbo5.pkg2022431708.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PBO52022431708Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
       /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan nama Kelinci , makanan , warna kelinci
 *
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        Manager m = new Manager();
        System.out.println("\t=======Program Perhitungan Gaji Karyawan ========");
        System.out.print("\tMasukan Nik : ");
        m.setNik(input.nextLine());
        System.out.print("\tMasukan Nama : ");
        m.setNama(input.nextLine());
        System.out.print("\tMasukan Golongan [ 1 / 2 / 3 ] : ");
        m.setGolongan(Integer.parseInt(input.nextLine()));
        System.out.print("\tMasukan Jabatan [ Manager / Kabag ] : ");
        m.setjabatan(input.nextLine());
        System.out.print("\tMasukan Jumlah Kehadiran : ");
        m.setKehadiran(input.nextInt());

        System.out.println();
        System.out.println();
        System.out.println("\t=====Hasil Perhitungan=====");

        System.out.println("\tNama : " + m.getNama());
        System.out.println("\tNik : " + m.getNik());
        System.out.println("\tGolongan : " + m.getGolongan());
        System.out.println("\tJabatan : " + m.getJabatan());

        System.out.println("\tTunjangan Golongan :  Rp. " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("\tTunjangan Jabatan : " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("\tTunjangan Kehadiran : Rp. " + m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("\tGaji Total : Rp.  " + m.totalGaji());

    }

}
