package model;

public class Kulkas extends Produk {

    private int kapasitas;

    // Constructor
    public Kulkas(String kode, String nama, double harga, int kapasitas) {
        super(kode, nama, harga);
        this.kapasitas = kapasitas;
    }

    // Getter
    public int getKapasitas() {
        return kapasitas;
    }

    // Setter
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Polymorphism (Override)
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.85; // Diskon 15%
    }

    // Override tampilkan data
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Kapasitas : " + kapasitas + " Liter");
        System.out.println("Harga Setelah Diskon : Rp " + hitungDiskon());
    }
}