package model;

public class MesinCuci extends Produk {

    private int kapasitasCuci;

    // Constructor
    public MesinCuci(String kode, String nama, double harga, int kapasitasCuci) {
        super(kode, nama, harga);
        this.kapasitasCuci = kapasitasCuci;
    }

    // Getter
    public int getKapasitasCuci() {
        return kapasitasCuci;
    }

    // Setter
    public void setKapasitasCuci(int kapasitasCuci) {
        this.kapasitasCuci = kapasitasCuci;
    }

    // Polymorphism (Override)
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.88; // Diskon 12%
    }

    // Override tampilkan data
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Kapasitas Cuci : " + kapasitasCuci + " Kg");
        System.out.println("Harga Setelah Diskon : Rp " + hitungDiskon());
    }
}