package Pertemuan14;

public class BinaryTreeArray04 {
    Mahasiswa04[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray04() {
        this.dataMahasiswa = new Mahasiswa04[10];
    }

    void populateData(Mahasiswa04 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
    public void add(Mahasiswa04 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Gagal menambahkan data! Array Binary Tree sudah penuh.");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}