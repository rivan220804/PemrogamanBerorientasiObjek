package Jobsheet6.HewanOOP3;

public class Mamalia extends Hewan {

    public Mamalia(String nama, int umur) {
        super(nama, umur);
        System.out.println("Konstruktor Mamalia dipanggil!");
    }

    void menyusui() {
        System.out.println(nama + " sedang menyusui anaknya...");
    }
}
