package jobsheet1;

import java.util.Scanner;

public class PraktikumPemilihan {

    public static void main(String[] args) {
        double nTugas, nKuis, nUts, nUas, nilaiAkhir;
        String grade = "", statusLulus = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir ");
        while (true) {
            System.out.println("==============================");
            System.out.print("Masukan Nilai Tugas\t: ");
            nTugas = sc.nextDouble();
            System.out.print("Masukan Nilai kuis\t: ");
            nKuis = sc.nextDouble();
            System.out.print("Masukan Nilai UTS\t: ");
            nUts = sc.nextDouble();
            System.out.print("Masukan Nilai UAs\t: ");
            nUas = sc.nextDouble();
            System.out.println("==============================");
            if (nTugas < 0 || nTugas > 100 || nKuis < 0 || nKuis > 100 || nUts < 0 || nUts > 100 || nUas < 0
                    || nUas > 100) {
                System.out.println("==============================");
                System.out.println("Nilai Tidak Valid");
                System.out.println("==============================");
            } else {
                break;
            }
        }
        nilaiAkhir = nTugas * 0.2 + nKuis * 0.2 + nUts * 0.3 + nUas * 0.3;
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            grade = "A";
            statusLulus = "Lulus";
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            statusLulus = "Lulus";
            grade = "B+";
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            statusLulus = "Lulus";
            grade = "B";
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            statusLulus = "Lulus";
            grade = "C+";
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            statusLulus = "Lulus";
            grade = "C";
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            grade = "D";
            statusLulus = "Tidak Lulus";
        } else if (nilaiAkhir <= 39 && nilaiAkhir > 0) {
            grade = "E";
            statusLulus = "Tidak Lulus";
        }
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Huruf\t: " + grade);
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiAkhir <= 50) {
            System.out.println("ANDA " + statusLulus);
        } else {
            System.out.println("SELAMAT ANDA " + statusLulus);
        }
        
    }
}