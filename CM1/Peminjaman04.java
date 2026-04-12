package CM1;

public class Peminjaman04 {
    Mahasiswa04 mhs;
    Buku04 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman04(Mahasiswa04 mhs, Buku04 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        int dendaPerHari = 2000;
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat <= 0) {
            denda = 0;
            terlambat=0;
        } else {
            denda = dendaPerHari * terlambat;
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                + " | Denda: " + denda);
    }
}
