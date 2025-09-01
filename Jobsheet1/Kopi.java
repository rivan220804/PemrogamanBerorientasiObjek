package Jobsheet1;

public class Kopi extends Minuman{
    String jenis;
    String tingkatKopi;

    Kopi(String nama, int volume, String jenis, String tingkatKopi) {
        super(nama, volume);
        this.jenis = jenis;
        this.tingkatKopi = tingkatKopi;
    }

    public void seduh() {
        System.out.println("Menyeduh kopi jenis " + jenis + " dengan tingkat " + tingkatKopi + ".");
    }

    public void cetakInfo() {
        System.out.println("Kopi: " + nama + ", Jenis: " + jenis + ", Tingkat: " + tingkatKopi + ", Volume: " + volume + "ml.");
    }
}
