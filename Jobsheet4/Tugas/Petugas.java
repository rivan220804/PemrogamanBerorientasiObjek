package Jobsheet4.Tugas;

public class Petugas {
    private String nama;
    private String idPetugas;

    public Petugas(String nama, String idPetugas) {
        this.nama = nama;
        this.idPetugas = idPetugas;
    }

    public String info() {
        return "Nama Petugas: " + nama + "\nID: " + idPetugas + "\n";
    }
}
