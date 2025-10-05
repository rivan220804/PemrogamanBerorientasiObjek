package Jobsheet6Teori.BangunDatar;

public class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    float keliling() {
        return (float) (2 * Math.PI * r);
    }
}