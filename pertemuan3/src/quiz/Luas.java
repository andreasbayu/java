package quiz;

public class Luas {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }

    public int getLuas() {
        return (alas * tinggi)/2;
    }
}
