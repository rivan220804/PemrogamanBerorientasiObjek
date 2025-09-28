package Jobsheet4.Tugas;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private Petugas petugas;
    private int lamaPinjam; // dalam hari

    public Peminjaman(Anggota anggota, Buku buku, Petugas petugas, int lamaPinjam) {
        this.anggota = anggota;
        this.buku = buku;
        this.petugas = petugas;
        this.lamaPinjam = lamaPinjam;
    }

    public int hitungDenda(int hariTelat) {
        int dendaPerHari = 1000; // Rp 1000 per hari
        return hariTelat * dendaPerHari;
    }

    public String info() {
        String info = "";
        info += anggota.info();
        info += buku.info();
        info += petugas.info();
        info += "Lama Pinjam: " + lamaPinjam + " hari\n";
        return info;
    }
}
