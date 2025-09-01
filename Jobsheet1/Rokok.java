package Jobsheet1;

public class Rokok extends RokokFilter {
    String merk;
    String jenisTembakau;

    Rokok(String merk, String jenisTembakau, String jenisFilter, int panjang) {
        super(merk, jenisTembakau, jenisFilter, panjang);
        this.merk = merk;
        this.jenisTembakau = jenisTembakau;
    }

    public void dibakar() {
        System.out.println("Rokok " + merk + " dinyalakan.");
    }

    public void dihisap() {
        System.out.println("Rokok " + merk + " sedang dihisap.");
    }

    public void cetakInfo() {
        System.out.println("Rokok merk " + merk + ", jenis tembakau: " + jenisTembakau + ".");
    }
}
