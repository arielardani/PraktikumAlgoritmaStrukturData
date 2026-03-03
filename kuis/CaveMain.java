package kuis;

import java.util.Scanner;

public class CaveMain {

    static Cave cv[] = new Cave[3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < cv.length; i++) {
            cv[i] = new Cave();
            System.out.println("Menu " + (i + 1));
            System.out.print("Masukan nama :");
            cv[i].nama = sc.nextLine();
            System.out.print("Masukan harga :");
            cv[i].harga = sc.nextInt();
            System.out.print("Masukan stock :");
            cv[i].stock = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------");
        }
        while (true) {
            System.out.print("pilih menu");
            int key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1:
                    tampilMenu();
                    break;
                case 2:
                    System.out.print("Pilih menu yang mau di tambah stock");
                    String a = sc.nextLine();
                    boolean status=false;
                    int j=0;
                    for (int i = 0; i < cv.length; i++) {
                        if (a.equalsIgnoreCase(cv[i].nama)) {
                            j=i;
                            status=true;
                            break;
                        } 
                    }
                    if(status){

                        System.out.print("berapa banyak Stock yang di tambah ");
                        int b = sc.nextInt();
                        int tambahan = cv[j].tambahStock(b);
                        cv[j].stock += tambahan;
                        System.out.println("stock berhasil ditambah");
                        System.out.println("Stock saat ini :" + cv[j].stock);
                    }else {
                        System.out.println("nama menu tidak ada");
                    }

                case 3:
                    System.out.print("Pilih menu yang mau di ubah harga");
                    String p = sc.nextLine();
                    boolean status1=false;
                    int o=0;
                    for (int i = 0; i < cv.length; i++) {
                        if (p.equalsIgnoreCase(cv[i].nama)) {
                            o=i;
                            status1=true;
                            break;
                        } 
                    }
                    if(status1){

                        System.out.print("berapa harga terbaru ");
                        int newHarga= sc.nextInt();
                        cv[o].ubahHarga(newHarga);
                    }else {
                        System.out.println("nama menu tidak ada");
                    }
            }

        }
    }

    static void tampilMenu() {
        for (Cave temp : cv) {
            int i = 1;
            System.out.println("menu " + i);
            temp.tampilkanMenu();
            System.out.println("----------------------------");
            i++;
        }
    }
}
