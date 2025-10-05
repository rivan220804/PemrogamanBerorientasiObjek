package Jobsheet6.HewanOOP4;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2, "Oranye");
        kucing.berjalan();
        kucing.info();

        // Menunjukkan perbedaan akses modifier
        // System.out.println(kucing.nama);   // ❌ Error, karena 'nama' bersifat private
        System.out.println("Umur: " + kucing.umur); // ✅ Valid, karena 'umur' protected dan bisa diakses subclass

        System.out.println();

        // Objek dari subclass tambahan (tugas praktikum)
        Anjing anjing = new Anjing("Rifky", 3, "Tebal");
        anjing.berjalan();
        anjing.info();
        System.out.println("Jenis bulu: " + anjing.getJenisBulu());
    }
}
