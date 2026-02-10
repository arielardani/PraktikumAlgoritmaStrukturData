package jobsheet1;

import java.util.Scanner;

public class PraktikumPerulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Masukan NIM : ");
        n = sc.nextDouble();
        n = n % 100;
        if (n < 10) {
            n = n + 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                System.out.print("");
            } else if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 == 1) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
        
    }
}