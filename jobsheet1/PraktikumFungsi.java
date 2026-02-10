package jobsheet1;

import java.util.Scanner;

public class PraktikumFungsi {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        double stock[][] = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        String namaBunga[]={"Aglonema ","Keladi ","Alocasia ="," Mawar"};
        double hargaBunga[]= {75000,50000,60000,10000};
        double totalPendapatan[]= new double[4];
         for (int i=0;i<stock.length;i++){
             for (int j = 0; j < stock[i].length; j++) {
                 totalPendapatan[i]+=stock[i][j]*hargaBunga[i];
             }
         }
        while (true) {
            System.out.println("=================");
            System.out.println("Menu program");
            System.out.println("1. Menampilkan pendapatan\n2.Tampilkan status dari setiap cabang");
            System.out.print("Pilih : ");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    TampilkanPendapatan(totalPendapatan);
                    break;
            case 2:
                StatusCabang(totalPendapatan);
                break;
                default:
                    break;
            }
        }
    }


    public static void TampilkanPendapatan(double arr1[]){
        System.out.print("Cabang berapa : ");
        int key = sc.nextInt();
        switch (key) {
            case 1:
                System.out.println("Pendapatan Royal Garden " + key+" : "+ arr1[(key-1)]);
                break;
            case 2:
                System.out.println("Pendapatan Royal Garden " + key+" : "+ arr1[(key-1)]);
                break;
            case 3:
                System.out.println("Pendapatan Royal Garden " + key+" : "+ arr1[(key-1)]);
                break;
            case 4:
                System.out.println("Pendapatan Royal Garden " + key+" : "+ arr1[(key-1)]);
                break;
            default:
                break;
        }
    }
    public static void StatusCabang(double arr1[]){
        String status[]=new String[4];
        for(int i=0;i<status.length;i++){
            if (arr1[i] > 1500000){
                status[i]= "Sangat Baik";
            }else{
                status[i]= "Perlu Evaluasi";
            }

        }

        System.out.print("pilih cabang : ");
        int key = sc.nextInt();
       switch (key) {
            case 1:
                System.out.println("status Royal Garden " + key+" : "+ status[(key-1)]);
                break;
            case 2:
                System.out.println("status Royal Garden " + key+" : "+ status[(key-1)]);
                break;
            case 3:
                System.out.println("status Royal Garden " + key+" : "+ status[(key-1)]);
                break;
            case 4:
                System.out.println("status Royal Garden " + key+" : "+ status[(key-1)]);
                break;
            default:
                break;
        }
        
        
    }
  
}
