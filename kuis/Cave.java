package kuis;

import java.nio.channels.Pipe.SourceChannel;

public class Cave {
    String nama;
    int harga;
    int stock;
    public Cave(){

    }public Cave(String nama, int harga,int stock){
        this.nama=nama;
        this.harga=harga;
        this.stock=stock;
    }
    void tampilkanMenu(){
        System.out.println("Nama : "+nama);
        System.out.println("Harga: "+harga );
        System.out.println("Stock: "+stock);
    }
   
    int tambahStock(int tmbStock){
        int jumlah =0;
        jumlah += tmbStock;
        return jumlah;
    }
    void ubahHarga(int c){
        harga=c;
        System.out.println("harga berhasil di ubah menjaddi "+harga);
    }
}
