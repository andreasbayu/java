package Pembelian5200411559;

public class Hewan {
    protected String nama;

    public void showNama() {
        System.out.println(nama);
    }
}

class Omnivore extends Hewan {
    public void setNama(String nama) {
        this.nama = nama;
    }
}

class Mainan {
    public static void main(String[] args) {
        Omnivore om = new Omnivore();
        om.setNama("helo");
        om.showNama();
    }
}