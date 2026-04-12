package CM1;

public class Buku04 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku04(String kode, String judul,int tahun){
        kodeBuku=kode;
        this.judul=judul;
        tahunTerbit=tahun;
    }
    void tampilBuku(){
        System.out.println("Kode: "+kodeBuku + "| Judul: "+judul + "| Tahun: "+tahunTerbit);
    }
}
