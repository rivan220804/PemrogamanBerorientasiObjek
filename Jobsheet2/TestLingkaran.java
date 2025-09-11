package Jobsheet2;

public class TestLingkaran {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran1 = new Lingkaran();

        // Mengisi nilai jari-jari
        lingkaran1.r = 7.0;

        // Menghitung dan menampilkan hasil
        System.out.println("=== Perhitungan Lingkaran ===");
        System.out.println("Jari-jari      : " + lingkaran1.r);
        System.out.println("Luas Lingkaran : " + lingkaran1.hitungLuas());
        System.out.println("Keliling       : " + lingkaran1.hitungKeliling());
    }
}
