package Jobsheet6.HewanOOP3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek Kucing ===");
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();

        System.out.println("\n=== Objek Anjing ===");
        Anjing anjing = new Anjing("Rifky", 3, "Bulldog");
        anjing.berjalan();
        anjing.menyusui();
        anjing.menggonggong();
    }
}
