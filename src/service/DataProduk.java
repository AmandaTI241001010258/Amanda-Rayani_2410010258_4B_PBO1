package service;

import model.Produk;

public class DataProduk {

    private Produk[] daftarProduk = new Produk[100];
    private int jumlah = 0;

    // Tambah produk
    public void tambahProduk(Produk produk) {
        if (jumlah < daftarProduk.length) {
            daftarProduk[jumlah] = produk;
            jumlah++;
            System.out.println("Produk berhasil ditambahkan.");
        } else {
            System.out.println("Data produk penuh.");
        }
    }

    // Tampilkan semua produk
    public void tampilkanProduk() {
        if (jumlah == 0) {
            System.out.println("Belum ada data produk.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nProduk ke-" + (i + 1));
            daftarProduk[i].tampilkanData();
        }
    }

    // Cari produk berdasarkan kode
    public Produk cariProduk(String kode) {
        for (int i = 0; i < jumlah; i++) {
            if (daftarProduk[i].getKode().equalsIgnoreCase(kode)) {
                return daftarProduk[i];
            }
        }
        return null;
    }

    
    // Edit produk
    public boolean editProduk(String kode, String namaBaru, double hargaBaru) {
        
        Produk produk = cariProduk(kode);
        
        if (produk != null) {
            produk.setNama(namaBaru);
            produk.setHarga(hargaBaru);
            return true;
    }
    return false;
}
    
    // Hapus produk
    public boolean hapusProduk(String kode) {
        for (int i = 0; i < jumlah; i++) {
            if (daftarProduk[i].getKode().equalsIgnoreCase(kode)) {

                for (int j = i; j < jumlah - 1; j++) {
                    daftarProduk[j] = daftarProduk[j + 1];
                }

                daftarProduk[jumlah - 1] = null;
                jumlah--;

                return true;
            }
        }
        return false;
    }

    // Getter jumlah data
    public int getJumlah() {
        return jumlah;
    }
}
