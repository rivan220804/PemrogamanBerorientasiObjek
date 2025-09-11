package Jobsheet2Teori;

public class matakuliah {
    private String kode;
    private String nama;
    private dosen dosenPengampu;

    public matakuliah(String kode, String nama, dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public dosen getDosenPengampu() {
        return dosenPengampu;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (Dosen: " + dosenPengampu.getNama() + ")";
    }
}
