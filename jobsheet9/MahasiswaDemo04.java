package jobsheet9;

import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        int pilih;
        int totalKumpul = 0;
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa04 stack = new StackTugasMahasiswa04(5);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Tugas yang sudah dikumpulkan saat ini");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa04 mhs = new Mahasiswa04(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    totalKumpul++;
                    break;
                case 2:
                    Mahasiswa04 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa04 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa04 lihat2 = stack.peekbwh();
                    if (lihat2 != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + lihat2.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    System.out.println("1. Termasuk yang sudah dinilai");
                    System.out.println("2. Tidak Termasuk yang sudah dinilai");
                    System.out.print("pilih: ");
                    int opsi = scan.nextInt();
                    switch (opsi) {
                        case 1:
                            System.out.println("Total semua tugas Termasuk yang sudah dinilai adalah " + totalKumpul);
                            break;
                        case 2:
                            System.out
                                    .println("Total semua tugas Tidak Termasuk yang sudah dinilai " + (stack.top + 1));
                            break;

                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}