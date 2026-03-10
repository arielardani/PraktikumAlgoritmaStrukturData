package BruteForceDivideConquer.minggu5.Tugas;

public class MahasiswaMain {
public static void main(String[] args) {
    Mahasiswa[] daftarMhs = new Mahasiswa[8];
        daftarMhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        daftarMhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        daftarMhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        daftarMhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        daftarMhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        daftarMhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        daftarMhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        daftarMhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);
    
        int nilaiTertinggi = daftarMhs[0].cariMax(daftarMhs, 0, daftarMhs.length - 1);
        int nilaiTerendah = daftarMhs[0].cariMin(daftarMhs, 0, daftarMhs.length-1 );
        System.out.println("Nlai UTS Tertinggi :" + nilaiTertinggi);
        System.out.println("Nilai UTS Terendah :" + nilaiTerendah);
        System.out.println("Rata-rata Nilai UAS :"+daftarMhs[0].rata(daftarMhs));
}
    
}