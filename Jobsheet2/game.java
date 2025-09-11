package Jobsheet2;

public class game {
    private int idGame;
    private String namaGame;
    private double hargaSewa;

    // Constructor
    public game(int idGame, String namaGame, double hargaSewa) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.hargaSewa = hargaSewa;
    }

    // Getter dan Setter
    public int getIdGame() {
        return idGame;
    }

    public void setIdGame(int idGame) {
        this.idGame = idGame;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public void setNamaGame(String namaGame) {
        this.namaGame = namaGame;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
}
