package Jobsheet2;

public class Lingkaran {
    // Atribut
    public double phi = 3.14; // konstanta phi
    public double r;          // jari-jari lingkaran

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return phi * r * r;
    }

    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
