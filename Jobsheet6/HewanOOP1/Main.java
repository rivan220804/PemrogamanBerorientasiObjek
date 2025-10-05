package Jobsheet6.HewanOOP1;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Lion");
        kucing.bersuara();
        kucing.mengeong();

        Anjing anjing = new Anjing("Rifky");
        anjing.bersuara();
        anjing.menggonggong();
    }
}
