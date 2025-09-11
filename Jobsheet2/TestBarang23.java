package Jobsheet2;

public class TestBarang23 {
     public static void main(String[] args) {
        // Membuat objek barang
        Barang23 brg1 = new Barang23();
        brg1.kode = "BRG001";
        brg1.namaBarang = "Headset Gaming";
        brg1.hargaDasar = 500000;
        brg1.diskon = 10f; // 10%

        // Menampilkan data barang
        brg1.tampilData();

        // Membuat objek barang kedua
        Barang23 brg2 = new Barang23();
        brg2.kode = "BRG002";
        brg2.namaBarang = "Keyboard Mechanical";
        brg2.hargaDasar = 750000;
        brg2.diskon = 20f; // 20%

        // Menampilkan data barang kedua
        brg2.tampilData();
    }
}
