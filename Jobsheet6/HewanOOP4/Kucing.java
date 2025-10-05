package Jobsheet6.HewanOOP4;

class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing(String nama, int umur, String warnaBulu) {
        super(nama, umur); // memanggil konstruktor dari superclass
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void info() {
        super.info(); // memanggil method info() dari Hewan
        System.out.println("Warna bulu: " + warnaBulu);
    }
}
