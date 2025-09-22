package Jobsheet4;

public class Processor {
    private String merk;
    private double cache;

    // Konstruktor default
    public Processor() {
    }

    // Konstruktor berparameter
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    // Setter dan Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache() {
        return cache;
    }

    // Method info
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
