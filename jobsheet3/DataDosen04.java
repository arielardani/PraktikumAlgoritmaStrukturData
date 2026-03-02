package jobsheet3;

public class DataDosen04 {
    void dataSemuaDosen(Dosen04[] arrayOfDosen) {

        System.out.println("=== data semua dosen ===");
        int i = 1;
        for (Dosen04 temp : arrayOfDosen) {
            System.out.println("dosen ke- " + i);
            System.out.println("kode : " + temp.kode);
            System.out.println("nama : " + temp.nama);
            System.out.println("jenis kelamin : " + (temp.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("usia : " + temp.usia);
            System.out.println("-------------------");
            i++;
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
    int pria = 0;
    int wanita = 0;
    
    for (int i=0;i<arrayOfDosen.length;i++) {
        if (arrayOfDosen[i].jenisKelamin) {
            pria++;
        } else {
            wanita++;
        }
    }
    System.out.println("Jumlah Dosen berdasarkan Jenis Kelamin");
    System.out.println("Dosen Pria   :" + pria);
    System.out.println("Dosen Wanita :" + wanita);
}
void rataRataUsiaDosenPerJenisKelamin(Dosen04[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, pria = 0, wanita = 0;

        for (int i=0;i<arrayOfDosen.length;i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalPria += arrayOfDosen[i].usia;
                pria++;
            } else {
                totalWanita += arrayOfDosen[i].usia;
                wanita++;
            }
        }
        int rataPria=totalPria/pria;
        int rataWanita=totalWanita/wanita;
        if (pria > 0)
            System.out.println("Rata rata Usia Dosen Pria   : " + (rataPria));

        if (wanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (rataWanita));
    }
    void infoDosenPalingTua(Dosen04[] arrayOfDosen) {
        Dosen04 tertua = arrayOfDosen[0];

        for (int i=0;i<arrayOfDosen.length;i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i];
            }
        }

        System.out.println("Data Dosen tertua");
        tertua.tampilkamData();
    }

    void infoDosenPalingMuda(Dosen04[] arrayOfDosen) {
        Dosen04 termuda = arrayOfDosen[0];

        for (int i=0;i<arrayOfDosen.length;i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i];
            }
        }

        System.out.println("Data Dosen termuda");
        termuda.tampilkamData();
    }
}