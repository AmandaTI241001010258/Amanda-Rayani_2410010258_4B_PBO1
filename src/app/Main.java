package app;

import java.util.Scanner;
import model.Kulkas;
import model.MesinCuci;
import model.Produk;
import model.TV;
import service.DataProduk;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DataProduk data = new DataProduk();

        int menu;

        do {

            System.out.println("\n====================================");
            System.out.println(" SISTEM PENJUALAN ELEKTRONIK UFO ");
            System.out.println("====================================");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");

            try {

                menu = input.nextInt();
                input.nextLine();

                switch (menu) {

                    case 1:

                        System.out.println("\nJenis Produk");
                        System.out.println("1. TV");
                        System.out.println("2. Kulkas");
                        System.out.println("3. Mesin Cuci");
                        System.out.print("Pilih : ");
                        int jenis = input.nextInt();
                        input.nextLine();

                        System.out.print("Kode : ");
                        String kode = input.nextLine();

                        System.out.print("Nama : ");
                        String nama = input.nextLine();

                        System.out.print("Harga : ");
                        double harga = input.nextDouble();

                        Produk produk = null;

                        if (jenis == 1) {

                            System.out.print("Ukuran Layar : ");
                            int ukuran = input.nextInt();

                            produk = new TV(kode, nama, harga, ukuran);

                        } else if (jenis == 2) {

                            System.out.print("Kapasitas (Liter) : ");
                            int kapasitas = input.nextInt();

                            produk = new Kulkas(kode, nama, harga, kapasitas);

                        } else if (jenis == 3) {

                            System.out.print("Kapasitas Cuci (Kg) : ");
                            int kapasitas = input.nextInt();

                            produk = new MesinCuci(kode, nama, harga, kapasitas);

                        } else {

                            System.out.println("Jenis tidak tersedia.");
                        }

                        if (produk != null) {
                            data.tambahProduk(produk);
                        }

                        break;

                    case 2:

                        data.tampilkanProduk();

                        break;

                    case 3:

                        System.out.print("Masukkan kode produk : ");
                        String cari = input.nextLine();

                        Produk hasil = data.cariProduk(cari);

                        if (hasil != null) {
                            hasil.tampilkanData();
                        } else {
                            System.out.println("Produk tidak ditemukan.");
                        }

                        break;

                    case 4:

                        System.out.print("Masukkan kode produk yang akan dihapus : ");
                        String hapus = input.nextLine();

                        if (data.hapusProduk(hapus)) {
                            System.out.println("Produk berhasil dihapus.");
                        } else {
                            System.out.println("Produk tidak ditemukan.");
                        }

                        break;

                    case 5:

                        System.out.println("Terima kasih telah menggunakan program.");
                        break;

                    default:

                        System.out.println("Menu tidak tersedia.");

                }

            } catch (Exception e) {

                System.out.println("Input harus berupa angka!");
                input.nextLine();
                menu = 0;

            }

        } while (menu != 5);

    }

}