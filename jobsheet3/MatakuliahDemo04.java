package jobsheet3;

import java.util.Scanner;

public class MatakuliahDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah matkul");
        int matkul = sc.nextInt();
        Matakuliah04[] arrayOfMatakuliah = new Matakuliah04[matkul];
        for (int i = 0; i < matkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah04();
            arrayOfMatakuliah[i].tambahData();
        }
        for (int i = 0; i < matkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}