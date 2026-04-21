package jobsheet9;

import java.sql.Struct;

public class SuratStack04 {
    Surat04[] stack;
    int top;
    int size;

    public SuratStack04(int size) {
        this.size = size;
        stack = new Surat04[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat04 pop() {
        if (!isEmpty()) {
            Surat04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk Di Proses.");
            return null;
        }
    }

    public Surat04 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada Surat yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" +
                    stack[i].namaMahasiswa + "\t" +
                    stack[i].kelas + "\t" +
                    stack[i].jenisIzin + "\t" +
                    stack[i].durasi);
        }
        System.out.println("");
    }

    public void searching(String key) {
        boolean ditemukan = false;
        int i = top;

        while (i >= 0) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(key)) {
                if (!ditemukan) {
                    System.out.println("Surat ditemukan:");
                    System.out.println("ID\tNama\tKelas\tIzin\tDurasi");
                }
                System.out.println(stack[i].idSurat + "\t" +
                        stack[i].namaMahasiswa + "\t" +
                        stack[i].kelas + "\t" +
                        stack[i].jenisIzin + "\t" +
                        stack[i].durasi);
                ditemukan = true;
            }
            i--;
        }

        if (!ditemukan) {
            System.out.println("Surat dengan nama " + key + " tidak ditemukan.");
        }
    }
}
