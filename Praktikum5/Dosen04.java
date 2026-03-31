package Praktikum5;

public class Dosen04 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen04(String kd, String name, String jk, int age) {
        kode = kd;
        nama= name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }
}
