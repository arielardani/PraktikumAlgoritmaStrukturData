package jobsheet3;

import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen04 dosen[] = new Dosen04[3];
        for (int i = 0; i < dosen.length; i++) {
            dosen[i] = new Dosen04();
            System.out.println("Masukan Data Dosen ke-" + (i + 1));
            System.out.print("Kode\t\t:");
            dosen[i].kode = sc.nextLine();
            System.out.print("Nama\t\t:");
            dosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin\t:");
            while (true) {
                String jk = sc.nextLine();
                if (jk.equalsIgnoreCase("Wanita")) {
                    dosen[i].jenisKelamin = false;
                    break;

                } else if (jk.equalsIgnoreCase("Pria")) {
                    dosen[i].jenisKelamin = true;
                    break;
                } else {
                    System.out.println("input salah");
                    System.out.print("Masukan Ulang (Pria/Wanita)");
                }
            }
            System.out.print("Usia\t\t:");
            dosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------");
        }

        for (Dosen04 temp : dosen) {
            temp.tampilkamData();
        }
        DataDosen04 data = new DataDosen04();
        data.dataSemuaDosen(dosen);
        data.jumlahDosenPerJenisKelamin(dosen);
        data.rataRataUsiaDosenPerJenisKelamin(dosen);
        data.infoDosenPalingTua(dosen);
        data.infoDosenPalingMuda(dosen);
    }
}