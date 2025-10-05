package Jobsheet6.HewanOOP4;

class Anjing extends Hewan {
    private String jenisBulu;

    public Anjing(String nama, int umur, String jenisBulu) {
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }

    @Override
    public void info() {
        super.info(); // menampilkan info dari superclass
        System.out.println("Jenis bulu: " + jenisBulu);
    }

    // Getter public untuk mengakses atribut private
    public String getJenisBulu() {
        return jenisBulu;
    }
}
