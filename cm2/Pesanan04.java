package cm2;

public class Pesanan04 {
    int kodePesanan;
    String namaPesanan;
    int harga;

    Pesanan04(int a, String b, int d){
        kodePesanan = a;
        namaPesanan = b;
        harga = d;
    }

    void tampil(){
        System.out.println(kodePesanan + "\t| " + namaPesanan + "\t| " + harga + "\t| ");
    }
}