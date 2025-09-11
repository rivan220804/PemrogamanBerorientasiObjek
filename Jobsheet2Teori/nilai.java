package Jobsheet2Teori;

import Jobsheet2.Mahasiswa;

public class nilai {
      private mahasiswa mahasiswa;
    private matakuliah mataKuliah;
    private double nilai;

    public nilai(mahasiswa mhs1, matakuliah mataKuliah, double nilai) {
        this.mahasiswa = mhs1;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public matakuliah getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return mahasiswa.getNama() + " - " + mataKuliah.getNama() + " : " + nilai;
    }
}
