package BruteForceDivideConquer.minggu5.Tugas;

public class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa() {

    }

    Mahasiswa(String nama, String nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

    int cariMax(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int max1 = cariMax(arr, l, mid);
        int max2 = cariMax(arr, mid + 1, r);

        if (max1 > max2) {
            return max1;
        } else {
            return max2;
        }
    }

    int cariMin(Mahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int min1 = cariMin(arr, l, mid);
        int min2 = cariMin(arr, mid + 1, r);

        if (min1 < min2) {
            return min1;
        } else {
            return min2;
        }
    }
    double rata(Mahasiswa arr[]){
        double rata=0;
        double total=0;
        for(int i=0;i<arr.length;i++){
            total += arr[i].nilaiUAS;
        }
        rata= total / arr.length;
        return rata;
    }
}