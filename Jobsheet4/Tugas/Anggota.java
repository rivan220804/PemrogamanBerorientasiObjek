package Jobsheet4.Tugas;

public class Anggota {
     private String nama;
    private String nim;

    public Anggota(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String info() {
        return "Nama Anggota: " + nama + "\nNIM: " + nim + "\n";
    }
}
