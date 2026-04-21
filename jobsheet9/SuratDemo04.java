package jobsheet9;

import java.util.Scanner;

public class SuratDemo04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SuratStack04 st = new SuratStack04(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Tampilkan Semua Surat");
            System.out.println("5. Cari berdasarkan nama");
            System.out.print("Pilih (1-5): ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I/A): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();

                    Surat04 srt = new Surat04(id, nama, kelas, jenis, durasi);
                    st.push(srt);
                    break;

                case 2:
                    Surat04 diproses = st.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dengan ID: " + diproses.idSurat);
                        System.out.println("Atas nama: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat04 teratas = st.peek();
                    if (teratas != null) {
                        System.out.println("Surat teratas saat ini:");
                        System.out.println("ID: " + teratas.idSurat + " | Nama: " + teratas.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.println("ID\tNama\tKelas\tIzin\tDurasi");
                    st.print();
                    break;

                case 5:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = scan.nextLine();
                    st.searching(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 5);

        scan.close();
    }
}