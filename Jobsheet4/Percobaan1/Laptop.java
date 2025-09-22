package Jobsheet4.Percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    // Konstruktor default
    public Laptop() {
    }

    // Konstruktor berparameter
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    // Setter & Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    // Method info
    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
