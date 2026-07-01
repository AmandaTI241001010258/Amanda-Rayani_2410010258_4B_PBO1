package model;

public class Produk {

    // Atribut
    private String kode;
    private String nama;
    private double harga;

    // Constructor
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method yang akan dioverride
    public double hitungDiskon() {
        return harga;
    }

    // Menampilkan data produk
    public void tampilkanData() {
        System.out.println("===========================");
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp " + harga);
    }
}
