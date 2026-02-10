package jobsheet1;

import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] nilai = new double[3][8];
        String[] grade = new String[8];
        String mk[] = new String[8];

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukan Matkul " + (i + 1) + " : ");
            mk[i] = sc.nextLine();
        }
        System.out.println("===================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===================");
        for (int i = 0; i < mk.length; i++) {
            while (true) {

                System.out.print("masukan nilai Angka untuk MK " + mk[i] + " : ");
                nilai[0][i] = sc.nextDouble();
                if (nilai[0][i] <= 100 && nilai[0][i] >= 0) {
                    break;
                } else {
                    System.out.println("Input salah");
                }
            }
            if (nilai[0][i] <= 100 && nilai[0][i] > 80) {
                grade[i] = "A";
                nilai[1][i] = 4;

            } else if (nilai[0][i] <= 80 && nilai[0][i] > 73) {
                nilai[1][i] = 3.5;
                grade[i] = "B+";
            } else if (nilai[0][i] <= 73 && nilai[0][i] > 65) {
                nilai[1][i] = 3;
                grade[i] = "B";
            } else if (nilai[0][i] <= 65 && nilai[0][i] > 60) {
                nilai[1][i] = 2.5;
                grade[i] = "C+";
            } else if (nilai[0][i] <= 60 && nilai[0][i] > 50) {
                nilai[1][i] = 2;
                grade[i] = "C";
            } else if (nilai[0][i] <= 50 && nilai[0][i] > 39) {
                nilai[1][i] = 1;
                grade[i] = "D";
            } else if (nilai[0][i] <= 39 && nilai[0][i] > 0) {
                nilai[1][i] = 0;
                grade[i] = "E";
            }
            System.out.print("Masukan bobot SKS dari matkul " + mk[i] + " : ");
            nilai[2][i] = sc.nextDouble();
        }
        double totalsks = 0, totalnilai = 0, ip;
        for (int i = 0; i < nilai[0].length; i++) {
            totalnilai += nilai[1][i] * nilai[2][i];
            totalsks += nilai[2][i];
        }
        ip = totalnilai / totalsks;
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-60s %-12s %-12s %-12s%n",
                "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk.length; i++) {
            double bobotNilai = nilai[1][i] * nilai[2][i];
            System.out.printf("%-60s %-12.2f %-12s %-12.2f%n",
                    mk[i], nilai[0][i], grade[i], bobotNilai);
        }

        System.out.println("=================");

        System.out.println("IP : " + ip);

    }
}
