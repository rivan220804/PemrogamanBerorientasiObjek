package Jobsheet2Teori;

public class persegimain {
    public static void main(String[] args) {
         persegi persegi1 = new persegi(5);

        persegi1.dataPersegi();

        System.out.println("Luas persegi     : " + persegi1.luasPersegi());
        System.out.println("Keliling persegi : " + persegi1.kelilingPersegi());
    }
}
