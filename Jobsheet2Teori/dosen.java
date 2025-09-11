package Jobsheet2Teori;

public class dosen {
     private String nidn;
    private String nama;

    public dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nidn + " - " + nama;
    }
}
