package Jobsheet4.Tugas;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String info() {
        return "Judul: " + judul + "\nPenulis: " + penulis + "\nTahun: " + tahunTerbit + "\n";
    }
}
