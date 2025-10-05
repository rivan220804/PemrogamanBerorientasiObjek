package Jobsheet6.KendaraanOOP;

class Truk extends Kendaraan {
    int kapasitasMuatan; // dalam ton

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " sedang membawa muatan berat...");
    }

    @Override
    void info() {
        super.info();
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
    }
}

