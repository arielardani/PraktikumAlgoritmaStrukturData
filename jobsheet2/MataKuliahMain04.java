package jobsheet2;

public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 5;
        mk1.jumlahJam = 5;

        System.out.println("Mata kuliah: 1");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangiJam(2);

        System.out.println("Mata kuliah: 2");
        MataKuliah04 mk2 = new MataKuliah04("BD", "Basis Data", 4, 4);
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
    }
}
