package Jobsheet2Teori;

import Jobsheet2.Mahasiswa;

public class main {
    public static void main(String[] args) {
        dosen dosen1 = new dosen("D001", "Pak Budi");
        matakuliah mk1 = new matakuliah("MK001", "Pemrograman Java", dosen1);
        mahasiswa mhs1 = new mahasiswa("M001", "Andi");

        sisteminformasi sistem = new sisteminformasi();
        sistem.inputNilai(mhs1, mk1, 88.5);

        sistem.tampilkanNilaiMahasiswa(mhs1);
    }
}
