package Jobsheet6.HewanOOP3;

public class Hewan {
    String nama;
    int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Konstruktor Hewan dipanggil!");
    }

    void berjalan() {
        System.out.println(nama + " sedang berjalan...");
    }
}
