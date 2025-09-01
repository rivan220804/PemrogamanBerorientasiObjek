package Jobsheet1;

public class LifestyleDemo {
    public static void main(String[] args) {
        Asbak asbak = new Asbak("Kaca", "Bulat");
        Korek korek = new Korek("Gas", "Hitam");

        // Objek pewarisan pertama (Rokok → RokokFilter)
        RokokFilter rokok = new RokokFilter("Black Cappucino", "Tembakau Lokal", "Karbon", 85);

        // Objek pewarisan kedua (Minuman → Kopi)
        Kopi kopi = new Kopi("Kopi Tubruk", 250, "Robusta", "Kental");

        // Cetak informasi dan jalankan method
        System.out.println("=== Objek Asbak ===");
        asbak.tampungAbu();
        asbak.cetakInfo();

        System.out.println("\n=== Objek Korek ===");
        korek.nyalakanApi();
        korek.cetakInfo();

        System.out.println("\n=== Objek Rokok Filter ===");
        rokok.infoFilter();
        rokok.cetakInfo();

        System.out.println("\n=== Objek Kopi ===");
        kopi.tuang();
        kopi.seduh();
        kopi.cetakInfo();
    }
}
