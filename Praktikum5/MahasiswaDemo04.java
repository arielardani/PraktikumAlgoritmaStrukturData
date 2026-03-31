package Praktikum5;

import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ini biar input ipk nya pakai . dan tidak pakai , bu
        sc.useLocale(Locale.ROOT);

        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04();
        Mahasiswa04[] mhs = new Mahasiswa04[5];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa04();
            System.out.print("Masukan NIM: ");
            mhs[i].nim = sc.nextLine();
            System.out.print("Masukan Nama: ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukan Kelas: ");
            mhs[i].kelas = sc.nextLine();
            System.out.print("Masukan IP: ");
            mhs[i].ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(mhs[i]);
        }
        // Mahasiswa04 m1 = new Mahasiswa04("123", "Zidan", "2A", 3.2);
        // Mahasiswa04 m2 = new Mahasiswa04("124", "Ayu", "2A", 3.5);
        // Mahasiswa04 m3 = new Mahasiswa04("125", "Sofi", "2A", 3.1);
        // Mahasiswa04 m4 = new Mahasiswa04("126", "Sita", "2A", 3.9);
        // Mahasiswa04 m5 = new Mahasiswa04("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDesc();
        list.tampil();
    }
}
