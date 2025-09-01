package Jobsheet1;

public class Korek {
    String jenis;
    String warna;

    Korek(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public void nyalakanApi() {
        System.out.println("Korek " + jenis + " menyala dengan api.");
    }

    public void isiUlang() {
        System.out.println("Korek diisi ulang dengan gas baru.");
    }

    public void cetakInfo() {
        System.out.println("Korek jenis " + jenis + ", warna: " + warna + ".");
    }
}
