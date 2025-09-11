package Jobsheet2;

public class member {
    private int idMember;
    private String nama;

    // Constructor
    public member(int idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getIdMember() {
        return idMember;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
