package Jobsheet6Teori.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        return panjang * lebar;
    }

    @Override
    float keliling() {
        return 2 * (panjang + lebar);
    }
}