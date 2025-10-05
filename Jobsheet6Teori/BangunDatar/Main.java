package Jobsheet6Teori.BangunDatar;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(4, 6);

        System.out.println("=== Persegi Panjang ===");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        System.out.println("\n=== Segitiga ===");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}
