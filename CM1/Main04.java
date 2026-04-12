package CM1;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa04 mhs[] = new Mahasiswa04[3];
        mhs[0]= new Mahasiswa04("22001","Andi","Teknik Informatika");
        mhs[1]= new Mahasiswa04("22002","Budi","Teknik Informatika");
        mhs[2]= new Mahasiswa04("22003","Citra","Sistem Informasi Bisnis");
        Buku04 buku [] = new Buku04[4];
        buku[0] = new Buku04("B001", "Algoritma", 2020);
        buku[1] = new Buku04("B002", "Basis Data", 2019);
        buku[2] = new Buku04("B003", "Pemrograman", 2021);
        buku[3] = new Buku04("B004", "Fisika", 2024);

        Peminjaman04[] pinjam = new Peminjaman04[5];
        pinjam[0] = new Peminjaman04(mhs[0], buku[0], 7);
        pinjam[1] = new Peminjaman04(mhs[1], buku[1], 3);
        pinjam[2] = new Peminjaman04(mhs[2], buku[2], 10);
        pinjam[3] = new Peminjaman04(mhs[2], buku[3], 6);
        pinjam[4] = new Peminjaman04(mhs[0], buku[1], 4);

        int i=0;
        while (i<pinjam.length) {
            pinjam[i].hitungDenda();
            i++;
        }

        while (true) {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa04 temp : mhs) {
                        temp.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku04 temp : buku) {
                        temp.tampilBuku();
                    }
                    break;
                case 3:
                System.out.println("Data Peminjaman: ");
                for (Peminjaman04 temp : pinjam) {
                    temp.tampilPeminjaman();
                }
                break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    Sorting(pinjam);
                    for (Peminjaman04 temp : pinjam) {
                        temp.tampilPeminjaman();
                    }
                    
                    break;
                case 5:
                    search(pinjam, sc);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    static void Sorting(Peminjaman04 pinjam[]){
        for (int i = 0; i < pinjam.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < pinjam.length; j++) {
                if (pinjam[j].denda > pinjam[max].denda) {
                    max = j;
                }
            }
            Peminjaman04 temp = pinjam[i];
            pinjam[i] = pinjam[max];
            pinjam[max] = temp;
        }
    }
    static void search(Peminjaman04 pinjam[],Scanner sc){

        int jumlah=0;
        System.out.print("Masukan NIM: ");
                    String cari = sc.nextLine();
        for(int i=0;i<pinjam.length;i++){
            if (pinjam[i].mhs.nim.equals(cari)){
               pinjam[i].tampilPeminjaman();
               jumlah++;
            }
        }

        if (jumlah==0){
            System.out.println("Data tidak ditemukan");
        }
    }
}
