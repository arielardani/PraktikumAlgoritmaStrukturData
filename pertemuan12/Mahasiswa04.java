package pertemuan12;

public class Mahasiswa04 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa04(){

    }
    Mahasiswa04(String nm,String name,String kls,double ip){
        nim=nm;
        nama=name;
        kelas=kls;
        ipk=ip;
    }
    void tampilInformasi(){
   
        System.out.print(nim);
        System.out.print("\t");
        System.out.print(nama);
        System.out.print("\t");
        System.out.print("\t");
        System.out.print(kelas);
        System.out.print("\t");
        System.out.print(ipk);
        System.out.println();
    }
}
