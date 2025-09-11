package Jobsheet2;

public class Barang23 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    // Method untuk menghitung harga jual
    public int hitungHargaJual() {
        // Rumus: harga jual = harga dasar - (diskon x harga dasar)
        int hargaJual = hargaDasar - (int)(diskon / 100 * hargaDasar);
        return hargaJual;
    }

    // Method untuk menampilkan data barang
    public void tampilData() {
        System.out.println("=== DATA BARANG ===");
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Dasar     : Rp " + hargaDasar);
        System.out.println("Diskon          : " + diskon + " %");
        System.out.println("Harga Jual      : Rp " + hitungHargaJual());
        System.out.println("====================");
    }
}
