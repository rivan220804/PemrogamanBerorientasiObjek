package Jobsheet6Teori.BangunDatar;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    float keliling() {
        // Asumsi segitiga sama sisi
        return 3 * alas;
    }
}