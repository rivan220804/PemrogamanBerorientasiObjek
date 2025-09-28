package Jobsheet4.Tugas;

public class MainTugas {
     public static void main(String[] args) {
        Anggota a = new Anggota("Budi", "20230123");
        Buku b = new Buku("Pemrograman Java", "Andi", 2022);
        Petugas p = new Petugas("Siti", "P001");

        Peminjaman pj = new Peminjaman(a, b, p, 7);

        System.out.println("=== Data Peminjaman ===");
        System.out.println(pj.info());

        System.out.println("Denda jika telat 3 hari = Rp " + pj.hitungDenda(3));
    }
}
