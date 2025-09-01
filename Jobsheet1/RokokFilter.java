package Jobsheet1;

public class RokokFilter {
   String jenisFilter;
    int panjang;

    RokokFilter(String merk, String jenisTembakau, String jenisFilter, int panjang) {
        super();
        this.jenisFilter = jenisFilter;
        this.panjang = panjang;
    }

    public void infoFilter() {
        System.out.println("Rokok ini memiliki filter jenis " + jenisFilter + ".");
    }

    public void cetakInfo() {
        String merk = null;
        String jenisTembakau = null;
        System.out.println("Rokok Filter " + merk + " (" + jenisTembakau + "), filter: " + jenisFilter + ", panjang: " + panjang + "mm.");
    }

}
