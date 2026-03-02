package jobsheet3;

public class Dosen04 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;
    public Dosen04(){

    }
    public Dosen04(String kode,String nama,Boolean jenisKelamin, int usia){
        this.kode=kode;
        this.nama=nama;
        this.jenisKelamin=jenisKelamin;
        this.usia=usia;
    }
    void tampilkamData(){
       System.out.println("kode \t\t:"+kode);
        System.out.println("nama\t\t:"+nama);
        System.out.println("jenis kelamin\t: "+(jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("usia\t\t:"+usia);
        System.out.println("-------------------------");
    }
    
}