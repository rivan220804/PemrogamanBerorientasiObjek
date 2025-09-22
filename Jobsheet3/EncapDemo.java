package Jobsheet3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
    if (newAge > 30) {
        age = 30;   // batasi maksimal 30
    } else if (newAge < 18) {
        age = 18;   // batasi minimal 18
    } else {
        age = newAge; // jika di antara 18–30, ambil nilai aslinya
    }
}
}