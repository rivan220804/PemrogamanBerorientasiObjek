package Jobsheet6.KendaraanOOP;

class Motor extends Kendaraan {
    int kapasitasCC;

    public Motor(String merk, int tahunProduksi, int kapasitasCC) {
        super(merk, tahunProduksi);
        this.kapasitasCC = kapasitasCC;
    }

    @Override
    void jalankan() {
        System.out.println("Motor " + merk + " sedang melaju dengan cepat...");
    }

    @Override
    void info() {
        super.info();
        System.out.println("Kapasitas CC: " + kapasitasCC);
    }
}
