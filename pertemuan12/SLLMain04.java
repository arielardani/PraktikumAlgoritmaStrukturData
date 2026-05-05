package pertemuan12;

import java.util.Scanner;

public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();
        // Scanner sc = new Scanner(System.in);
        // while (true) {
        // System.out.println("Menu:");
        // System.out.println("1. Tambahkan data di Awal");
        // System.out.println("2. Tambahkan data di Akhir");
        // System.out.println("3. Tambahkan data Setelah data (Nama)");
        // System.out.println("4. Tambahkan data Di nomor (Indeks)");
        // System.out.println("5. Tampilkan data");
        // System.out.println("6. Keluar");
        // System.out.print("Pilih: ");
        // int pilihan = sc.nextInt();
        // sc.nextLine();

        // switch (pilihan) {
        // case 1:
        // System.out.print("NIM: ");
        // String nim1 = sc.nextLine();
        // System.out.print("Nama: ");
        // String nama1 = sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas1 = sc.nextLine();
        // System.out.print("IPK: ");
        // double ipk1 = sc.nextDouble();

        // Mahasiswa04 mhs1 = new Mahasiswa04(nim1, nama1, kelas1, ipk1);
        // sll.addFirst(mhs1);
        // break;
        // case 2:
        // System.out.print("NIM: ");
        // String nim2 = sc.nextLine();
        // System.out.print("Nama: ");
        // String nama2 = sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas2 = sc.nextLine();
        // System.out.print("IPK: ");
        // double ipk2 = sc.nextDouble();

        // Mahasiswa04 mhs2 = new Mahasiswa04(nim2, nama2, kelas2, ipk2);
        // sll.addLast(mhs2);
        // break;
        // case 3:
        // System.out.print("Cari Nama Mahasiswa: ");
        // String key = sc.nextLine();
        // System.out.print("NIM Baru: ");
        // String nim3 = sc.nextLine();
        // System.out.print("Nama Baru: ");
        // String nama3 = sc.nextLine();
        // System.out.print("Kelas Baru: ");
        // String kelas3 = sc.nextLine();
        // System.out.print("IPK Baru: ");
        // double ipk3 = sc.nextDouble();
        // Mahasiswa04 mhs3 = new Mahasiswa04(nim3, nama3, kelas3, ipk3);
        // sll.insertAfter(key, mhs3);
        // break;
        // case 4:
        // System.out.print("Indeks: ");
        // int idx = sc.nextInt();
        // sc.nextLine();
        // System.out.print("NIM: ");
        // String nim4 = sc.nextLine();
        // System.out.print("Nama: ");
        // String nama4 = sc.nextLine();
        // System.out.print("Kelas: ");
        // String kelas4 = sc.nextLine();
        // System.out.print("IPK: ");
        // double ipk4 = sc.nextDouble();

        // Mahasiswa04 mhs4 = new Mahasiswa04(nim4, nama4, kelas4, ipk4);
        // sll.insertAt(idx, mhs4);
        // break;
        // case 5:
        // sll.print();
        // break;
        // case 6:
        // System.out.println("Keluar Program");
        // sc.close();
        // return;
        // default:
        // System.out.println("Pilihan tidak valid!");
        // }
        // }
        Mahasiswa04 mhs1 = new Mahasiswa04("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa04 mhs2 = new Mahasiswa04("23212201", "Bimon", "2B", 3.8);
        Mahasiswa04 mhs3 = new Mahasiswa04("22212202", "Cintia", "3C", 3.5);
        Mahasiswa04 mhs4 = new Mahasiswa04("21212203", "Dirga", "4D", 3.6);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
