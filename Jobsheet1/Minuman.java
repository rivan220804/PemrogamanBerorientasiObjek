package Jobsheet1;

public class Minuman {
    String nama;
    int volume;

    Minuman(String nama, int volume) {
        this.nama = nama;
        this.volume = volume;
    }

    public void tuang() {
        System.out.println(nama + " dituangkan ke gelas.");
    }

    public void minum() {
        System.out.println("Meminum " + nama + ".");
    }

    public void cetakInfo() {
        System.out.println("Minuman: " + nama + ", Volume: " + volume + "ml.");
    }
}
