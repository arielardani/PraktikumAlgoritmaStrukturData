package cm2;

import java.util.Scanner;

public class Main04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DLLPesanan04 dllPesan = new DLLPesanan04();
        DLLPembeli04 dllPembeli = new DLLPembeli04();

        while (true) {
            tampilkanMenu();
            System.out.print("Pilih menu : ");
            int key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    Pembeli04 inp = inputPembeli();
                    dllPembeli.addLast(inp);
                    break;
                case 2:
                    dllPembeli.print();
                    break;
                case 3:
                    if (dllPembeli.isEmpty()){
                        System.out.println("Tidak ada antrean");
                        break;
                    }else{
                        Pesanan04 inp2 = inputPesanan();
                        dllPesan.addLast(inp2);
                        dllPembeli.removeFirst();
                        System.out.println(inp2.namaPesanan);
                        break;
                    }
                case 4:
                    if (dllPesan.isEmpty()){
                        System.out.println("Belum ada pesanan tercatat");
                        break;
                    }else {
                    dllPesan.sortNama();
                    dllPesan.print();
                        break;
                    }
                case 0:
                    System.out.println("Keluar Program");
                    sc.close();
                    return;
                default:
                    System.out.println("Input salah");
                    break;
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("======================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("======================================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesan");
        System.out.println("0. Keluar");
        System.out.println("--------------------------------------");
    }

    public static Pembeli04 inputPembeli() {
        System.out.print("Nama Pembeli: ");
        String np = sc.nextLine();
        System.out.print("No HP: ");
        String nh = sc.nextLine();
        return new Pembeli04(np, nh);
    }

    public static Pesanan04 inputPesanan() {
        System.out.print("Kode pesanan: ");
        int kd = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama Pesanan: ");
        String nape = sc.nextLine();
        System.out.print("Harga: ");
        int hg = sc.nextInt();
        return new Pesanan04(kd, nape, hg);
    }
}