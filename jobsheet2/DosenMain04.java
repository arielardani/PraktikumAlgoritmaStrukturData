package jobsheet2;

public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dosen1 = new Dosen04();
        System.out.println("Dosen : 1");
        dosen1.idDosen = "AP";
        dosen1.nama = "Ariel Putra";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2001;
        dosen1.bidangKeahlian = "Elektro";
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa Kerja \t\t: " + dosen1.hitungMasaKerja(2026) + " Tahun");
        dosen1.ubahKeahlian("Sistem Komputer");
        System.out.println();
        Dosen04 dosen2 = new Dosen04("CDA", "Chloe d'Apchier", false, 2010, "Basis Data");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa Kerja\t\t: " + dosen2.hitungMasaKerja(2026) + " Tahun");
        dosen2.ubahKeahlian("Sistem Operasi");
    }

}
