package Jobsheet6.KendaraanOOP;

class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void jalankan() {
        System.out.println("Mobil " + merk + " sedang berjalan di jalan raya...");
    }

    @Override
    void info() {
        super.info();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
