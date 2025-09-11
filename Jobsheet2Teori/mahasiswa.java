package Jobsheet2Teori;

public class mahasiswa {
     private String nim;
    private String nama;

    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
     public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nim + " - " + nama;
    }
}
