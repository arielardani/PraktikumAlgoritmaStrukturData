package pertemuan12.Tugas;

import java.util.Scanner;

public class MainAntrian04 {
    public static void main(String[] args) {
        MahasiswaQueue04 antrean = new MahasiswaQueue04();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian (Daftar)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrian Depan & Belakang");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("NIM  : "); String nim = sc.nextLine();
                    System.out.print("Nama : "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    System.out.print("IPK  : "); double ipk = sc.nextDouble();
                    antrean.enqueue(new Mahasiswa04(nim, nama, kelas, ipk));
                    break;
                case 2:
                    antrean.dequeue();
                    break;
                case 3:
                    antrean.peek();
                    break;
                case 4:
                    antrean.PrintSize();
                    break;
                case 5:
                    antrean.printAll();
                    break;
                case 6:
                    antrean.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program antrian...");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}