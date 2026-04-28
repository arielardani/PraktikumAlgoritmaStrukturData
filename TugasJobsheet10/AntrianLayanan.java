package TugasJobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahKrs=0;
    int maxKrs=30;

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            if (size <= 1) {
                System.out.println("Data antrian hanya ada 1");
            } else {
                System.out.println("Mahasiswa terdepan: ");
                System.out.println("NIM - NAMA - PRODI - KELAS");
                data[front % max].tampilkanData();
                data[(front + 1) % max].tampilkanData();
            }
        }
    }

    public void lihatTerbelakang() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - Nama - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
    public int getJumlahKrs(){
        return jumlahKrs;
    }
    public int getMaxKrs(){
        return maxKrs;
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

public void layaniMahasiswa(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
            return;
        }

        if(size == 1){
            System.out.println("Data antrian masih 1");
        }else{
            System.out.println("Melayani mahasiswa: ");
            for (int i = 0; i < 2; i++) {
                Mahasiswa mhs = data[front];
                front = (front + 1) % max;
                size--;
                mhs.tampilkanData();
                jumlahKrs++;
            }
        }
    }

}