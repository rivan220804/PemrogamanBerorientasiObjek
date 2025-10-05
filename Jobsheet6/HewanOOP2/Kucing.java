package Jobsheet6.HewanOOP2;

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); // memanggil konstruktor dari superclass Hewan
        this.ras = ras;
        System.out.println("Konstruktor Kucing dipanggil!");
    }
}
