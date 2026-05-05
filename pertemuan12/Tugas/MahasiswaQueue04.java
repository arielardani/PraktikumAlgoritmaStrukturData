package pertemuan12.Tugas;

public class MahasiswaQueue04 {
    Node04 head, tail;
    int size;

    public MahasiswaQueue04() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(Mahasiswa04 input) {
        Node04 newNode = new Node04(input, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil antrian: ");
            head.data.tampilInformasi();
            System.out.println();
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }


    public void peek() {
        if (!isEmpty()) {
            System.out.print("Antrian Terdepan: ");
            head.data.tampilInformasi();
            System.out.print("\nAntrian Terakhir: ");
            tail.data.tampilInformasi();
            System.out.println();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void PrintSize() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        Node04 tmp = head;
        System.out.println("Daftar Antrian:");
        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println();
    }
}
