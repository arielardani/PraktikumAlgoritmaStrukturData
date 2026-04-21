package jobsheet9;

public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int top;
    int size;

    public StackTugasMahasiswa04(int size) {
        this.size = size;
        stack = new Mahasiswa04[size];
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

    public void push(Mahasiswa04 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa04 pop() {
        if (!isEmpty()) {
            Mahasiswa04 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa04 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa04 peekbwh() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalKeBiner(int nilai // nilai yang akan di konversi ditaruh padaparameter

    ) {
        StackKonversi04 stack = new StackKonversi04(); // dilakukan instansi class StackKonversi04 menjadi objek stack
        while (nilai !=0) { // looping hingga nilai menjadi 0
            int sisa = nilai % 2; //nilai akan di modulus 2 dan hasil dari modulus masuk ke variabel sisa
            stack.push(sisa);//variabel sisa akan masuk ke parameter dari method push
            nilai = nilai / 2;//nilai akan dibagi 2 sehingga akan lanjut ke digit biner selanjutnya
        }
        String biner = new String();//inisialisasi objek biner
        while (!stack.isEmpty()) {//melakukan pengecekan apakah stack tidak kosong
            biner += stack.pop();//dilakukan pop pada array untuk di masukan ke dalam variable biner
        }
        return biner;// dilakukan return untuk mengembalikan nilai dari biner
    }
}