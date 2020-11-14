/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Nilai Mahasiswa
 */
public class IF110119025Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Nilai nilai = new Nilai(75, 45,34);
        double NA = nilai.hitungNA();
        char Index = nilai.menentukanIndex(NA);
        System.out.println("QUIZ        = " + nilai.getQUIZ());
        System.out.println("UTS         = " + nilai.getUTS());
        System.out.println("UAS         = " + nilai.getUAS());
        System.out.println("\nNIlai Akhir = " + NA);
        System.out.println("\nIndex = " + Index);
        System.out.println("Keterangan = " + nilai.hasilKeterangan(Index));
    }
}