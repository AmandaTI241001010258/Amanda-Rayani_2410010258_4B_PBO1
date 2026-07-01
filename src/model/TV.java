package model;

public class TV extends Produk {

    private int ukuranLayar;

    // Constructor
    public TV(String kode, String nama, double harga, int ukuranLayar) {
        super(kode, nama, harga);
        this.ukuranLayar = ukuranLayar;
    }

    // Getter
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    // Setter
    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    // Polymorphism (Override)
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.90; // Diskon 10%
    }

    // Override tampilkan data
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Ukuran Layar : " + ukuranLayar + " inci");
        System.out.println("Harga Setelah Diskon : Rp " + hitungDiskon());
    }
}