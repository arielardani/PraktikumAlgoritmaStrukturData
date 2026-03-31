package Praktikum5;

import java.util.Scanner;

public class DosenMain04 {
    public static void main(String[] args) {
        DataDosen04 list = new DataDosen04();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC");
            System.out.println("4. Sorting Usia DSC");
            System.out.println("5. Keluar");
            System.out.println("===========================");
            System.out.print("Pilih Menu: ");
            int key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    String jk = sc.nextLine();
                    System.out.print("Usia: ");
                    int umur = sc.nextInt();
                    sc.nextLine();
                    Dosen04 dosen = new Dosen04(kode, nama, jk, umur);
                    list.tambah(dosen);
                    break;
                case 2:
                    list.tampil();
                    break;
                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;
                case 4:
                    list.SortingDSC();
                    list.tampil();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    return;

                default:
                    break;
            }
        }
    }
}
