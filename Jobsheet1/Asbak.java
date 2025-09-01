package Jobsheet1;

public class Asbak {
    String bahan;
    String bentuk;

    Asbak(String bahan, String bentuk) {
        this.bahan = bahan;
        this.bentuk = bentuk;
    }

    public void tampungAbu() {
        System.out.println("Asbak berbentuk " + bentuk + " menampung abu rokok.");
    }

    public void bersihkan() {
        System.out.println("Asbak berbahan " + bahan + " dibersihkan hingga bersih.");
    }

    public void cetakInfo() {
        System.out.println("Asbak berbahan " + bahan + ", bentuk: " + bentuk + ".");
    }
}
