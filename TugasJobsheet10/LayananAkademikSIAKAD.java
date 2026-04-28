package TugasJobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Cek antrian kosong");
            System.out.println("4. Cek antrian penuh");
            System.out.println("5. Kosongkan antrian");
            System.out.println("6. Tampilkan Antrian");
            System.out.println("7. Tampilkan 2 Antrian Terdepan");
            System.out.println("8. Tampilkan Antrian Paling Akhir");
            System.out.println("9. Cetak jumlah antrian");
            System.out.println("10. Cetak jumlah yang sudah melakukan proses krs");
            System.out.println("11. Cetak jumlah mahasiswa yang belum melakukan proses KRS.");

            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.layaniMahasiswa();
                    break;

                case 3:
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println("Antrian Tidak Kosong");
                    }
                    break;

                case 4:
                    if (antrian.IsFull()) {
                        System.out.println("Antrian Penuh");
                    } else {
                        System.out.println("Antrian Tidak Penuh");
                    }
                    break;

                case 5:
                    antrian.clear();
                    break;
                case 6:
                    antrian.tampilkanSemua();
                    break;
                case 7:
                    antrian.lihat2Terdepan();
                    break;

                case 8:
                    antrian.lihatTerbelakang();
                    break;
                case 9:
                    System.out.println("jumlah antrian = " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("jumlah yang sudah melakukan proses krs :" + antrian.getJumlahKrs());
                    break;
                    int a = antrian.getMaxKrs();
                    int b = antrian.getJumlahKrs();
                    case 11:
                    System.out.println("jumlah mahasiswa yang belum melakukan proses krs :"+(a-b));
                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        sc.close();
    }
}