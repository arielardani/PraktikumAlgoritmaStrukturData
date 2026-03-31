package Praktikum5;

public class DataDosen04 {
    Dosen04 dataDosen[] = new Dosen04[10];
    int idx;

    void tambah(Dosen04 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            System.out.println("Dosen " + (i+1));
            dataDosen[i].tampil();
            System.out.println("-------------------------");
        }
    }

  void SortingASC() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - i - 1; j++) {
            if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                Dosen04 temp = dataDosen[j];
                dataDosen[j] = dataDosen[j + 1];
                dataDosen[j + 1] = temp;
            }
        }
    }
}


    void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen04 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

}
