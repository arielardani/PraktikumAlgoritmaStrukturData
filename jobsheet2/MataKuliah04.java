package jobsheet2;

import java.util.Scanner;

public class MataKuliah04 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    Scanner sc = new Scanner(System.in);
    public MataKuliah04() {

    }

    public MataKuliah04(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah\t:"+kodeMK);
        System.out.println("Nama\t\t\t:"+nama);
        System.out.println("SKS\t\t\t:" +sks);
        System.out.println("Jumlah Jam\t\t:"+jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi : "+sks);
    }

    void tambahJam(int jam) {
    jumlahJam+=jam;
    System.out.println("jumlah jam bertambah menjadi : " +jumlahJam);
    }

    void kurangiJam(int jam) {
        if(jumlahJam<=jam){
            System.out.println("jumlah jam tidak mencukupi untuk di kurangi "+jam);
        }else{
            jumlahJam-=jam;
            System.out.println("Jumlah jam berkurang menjadi "+jumlahJam);
        }
    }
}
