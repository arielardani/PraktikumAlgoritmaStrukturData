package jobsheet1;

import java.util.Scanner;

public class Tugas1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] kota = { { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };
                char[] kode= {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
                System.out.print("Masukan kode ");
                char key = sc.next().charAt(0);
                int a = Search(key,kode);
                for(int i=0;i<kota[a].length;i++){
                    System.out.print(kota[a][i]);
                    System.out.print(" ");
                }
    }
public static int Search (char a,char c[]){
    int index = 0;
    for (int i=0;1<c.length;i++){
        if (a!=c[i]){
            index++;
        } else if (a==c[i]) {
        break  ;
        }
    }
 return index;
}
}
