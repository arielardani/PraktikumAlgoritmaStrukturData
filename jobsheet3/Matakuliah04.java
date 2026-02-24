package jobsheet3;

import java.util.Scanner;

public class Matakuliah04 {
   
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    static Scanner sc = new Scanner(System.in);
    public Matakuliah04(){

    }
    public Matakuliah04 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData() {
        String dummy;
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Sks        : ");
        dummy = sc.nextLine();
        this.sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        this.jumlahJam = Integer.parseInt(dummy);
        System.out.println("--------------------------------------");
    }
    void cetakInfo(){
         System.out.println("Kode       : " + kode);
            System.out.println("Nama       : " + nama);
            System.out.println("Sks        : " + sks);
            System.out.println("Jumlah Jam : " + jumlahJam);
            System.out.println("--------------------------------------");
    }
}

