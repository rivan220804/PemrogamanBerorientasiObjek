package Jobsheet2;

import java.lang.reflect.Member;

public class peminjaman {
    private int idPeminjaman;
    private Member member;
    private game game;
    private int lamaSewa;
    private double totalBayar;

    // Constructor
    public peminjaman(int idPeminjaman, member member2, game game, int lamaSewa) {
        this.idPeminjaman = idPeminjaman;
        Member m = (Member) member2;
        Member m2 = (Member) member2;
        this.member = m2;
        this.game = game;
        this.lamaSewa = lamaSewa;
        this.totalBayar = hitungTotal();
    }

    // Method untuk menghitung total bayar
    public double hitungTotal() {
        return lamaSewa * game.getHargaSewa();
    }

    // Method untuk menampilkan detail peminjaman
    public void tampilkanData() {
        System.out.println("=== Detail Peminjaman ===");
        System.out.println("ID Peminjaman : " + idPeminjaman);
        System.out.println("Nama Member   : " + member.getName());
        System.out.println("Nama Game     : " + game.getNamaGame());
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga Sewa    : Rp " + game.getHargaSewa());
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("=========================");
    }
}
