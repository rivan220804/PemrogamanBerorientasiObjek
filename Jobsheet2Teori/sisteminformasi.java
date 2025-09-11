package Jobsheet2Teori;

import java.util.ArrayList;
import java.util.List;

import Jobsheet2.Mahasiswa;

public class sisteminformasi {
      private List<nilai> daftarNilai = new ArrayList<>();

    public void inputNilai(mahasiswa mhs1, matakuliah mataKuliah, double nilai) {
        daftarNilai.add(new nilai(mhs1, mataKuliah, nilai));
    }

    public void tampilkanNilaiMahasiswa(mahasiswa mhs1) {
        System.out.println("Nilai untuk " + mhs1.getNama() + ":");
        for (nilai n : daftarNilai) {
            if (n.getMahasiswa().getNama().equals(mhs1.getNama())) {
                System.out.println("- " + n.getMataKuliah().getNama() + ": " + n.getNilai());
            }
        }
    }
}
