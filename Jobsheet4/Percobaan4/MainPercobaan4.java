package Jobsheet4.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        // Tambahan percobaan
        Penumpang budi = new Penumpang("67890", "Budi");
        gerbong.setPenumpang(budi, 1); // Coba isi kursi yang sudah terisi
    }
}
