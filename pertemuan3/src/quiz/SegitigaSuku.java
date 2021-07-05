package quiz;

public class SegitigaSuku {
    public static void main(String[] args) {
        Luas luas = new Luas();

        luas.setAlas(12);
        luas.setTinggi(10);
        System.out.printf("Segitiga \nAlas\t:%d\nTinggi\t:%d\nLuasnya adalah\t:%d\n", luas.getAlas(), luas.getTinggi(), luas.getLuas());
    }
}
