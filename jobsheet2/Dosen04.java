package jobsheet2;

public class Dosen04 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen04() {

    }

    public Dosen04(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen=idDosen;
        this.nama=nama;
        this.statusAktif=statusAktif;
        this.tahunBergabung=tahunBergabung;
        this.bidangKeahlian=bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen\t\t:"+idDosen);
        System.out.println("Nama\t\t\t:"+nama);
        if (statusAktif){
            System.out.println("Status keaktifan\t:Aktif");
        }else{
            System.out.println("Status keaktifan\t:Tidak Aktif");
        }
        System.out.println("Tahun Bergabung\t\t:"+tahunBergabung);
        System.out.println("Bidang Keahlian\t\t:"+bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif=status;
        if (status){
            System.out.println("Status dosen diubah menjadi Aktif");
        }else{
            System.out.println("Status dosen diubah menjadi Tidak Aktif");
        }
    }
    int hitungMasaKerja(int thnSkrg){
        int masaKerja=thnSkrg-tahunBergabung;
        return masaKerja;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian=bidang;
        System.out.println("Bidang Keahlian diubah menjadi :"+bidangKeahlian);
    }
}
