package cm2;

public class DLLPembeli04 {
    NodePembeli04 head;
    NodePembeli04 tail;

    public DLLPembeli04() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli04 data) {
        NodePembeli04 newNode = new NodePembeli04(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        NodePembeli04 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
            System.out.println("-----------------------------------");
        }
    }

    public void removeFirst() {
        Pembeli04 hapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.print(hapus.namaPembeli+" Telah memesan ");
    }
}
