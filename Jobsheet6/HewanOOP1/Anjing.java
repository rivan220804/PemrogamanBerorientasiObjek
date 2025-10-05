package Jobsheet6.HewanOOP1;

class Anjing extends Hewan {
    public Anjing (String nama) {
    this.nama = nama;
    }
    
    @Override
    void bersuara() {
        System.out.println("Guk...Guuk!");
        }

    void menggonggong() {
        System.out.println("Guk...Guuk!");
    }
}