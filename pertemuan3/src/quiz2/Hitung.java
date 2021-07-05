package quiz2;

public class Hitung {
    private int jarakPeta;
    protected final int skala = 1000000;

    public void setJarakPeta(int jp) {
        jarakPeta = jp;
    }

    public int getJarakPeta() {
        return jarakPeta;
    }

    public int getJarakAsli() {
        return jarakPeta * skala;
    }

    public int getJarakKM() {
        return getJarakAsli() / 100000;
    }
}
