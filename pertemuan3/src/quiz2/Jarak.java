package quiz2;

public class Jarak {
    public static void main(String[] args) {
        Hitung ht = new Hitung();

        ht.setJarakPeta(20);
        System.out.printf("Jarak Pada Peta\t\t: %d cm\nJarak Sebenarnya\t: %d cm", ht.getJarakPeta(), ht.getJarakAsli());
        System.out.printf("\nJarak Dalam KM\t\t: %d", ht.getJarakKM());
    }
}
