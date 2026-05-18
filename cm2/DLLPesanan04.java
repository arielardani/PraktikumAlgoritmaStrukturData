package cm2;

public class DLLPesanan04 {
    NodePesanan04 head;
    NodePesanan04 tail;

    public DLLPesanan04() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan04 data) {
        NodePesanan04 newNode = new NodePesanan04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        NodePesanan04 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
            System.out.println("-----------------------------------");
        }
    }

    public void sortNama() {
        // sorting yang saya gunakan adalah selection sort
        NodePesanan04 current = head;

        while (current != null) {
            NodePesanan04 min = current;
            NodePesanan04 temp = current.next;
            while (temp != null) {
                if (temp.data.namaPesanan.compareToIgnoreCase(min.data.namaPesanan) < 0) {
                    min = temp;
                }
                temp = temp.next;
            }

            Pesanan04 tukar = current.data;
            current.data = min.data;
            min.data = tukar;

            current = current.next;
        }
    }
}
