package Jobsheet2Teori;

public class persegi {
     private int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }
     public void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    public int luasPersegi() {
        return sisi * sisi;
    }

    public int kelilingPersegi() {
        return 4 * sisi;
    }
}
