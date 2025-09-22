package Jobsheet3;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // Konstruktor
    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // awalnya belum ada pinjaman
    }

    // Getter
    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    // Method untuk mengangsur
    public void angsur(int jumlah) {
        if (jumlah >= (jumlahPinjaman * 0.1)) { 
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0; // jangan sampai minus
            }
        } else {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman!");
        }
    }
}
