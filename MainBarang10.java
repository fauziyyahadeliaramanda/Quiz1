import java.net.SocketTimeoutException;
import java.util.Scanner;
public class MainBarang10 {

    private static final Barang10[] BARANGS = {
        new Barang10("K01", "Sabun", 1000, 5),
        new Barang10("K02", "Pasta Gigi", 2000, 10),
        new Barang10("K03", "Biore", 3000, 23),
        new Barang10("K04", "Shampoo", 4000, 55),
        new Barang10("K05", "Sikat Gigi", 5000, 15)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanBarang();
                    break;
                case 2:
                    lakukanPembelian(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah berbelanja!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }

    private static void tampilkanMenu() {
        System.out.println("========== TOKO MAJU MUNDUR CANTIK ===========");
        System.out.println("1. Tampilkan Barang");
        System.out.println("2. Beli");
        System.out.println("3. Tampilkan Pembelian");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private static void tampilkanBarang() {
        System.out.println("========== Daftar Barang ===========");
        System.out.println("| Kode | Nama Barang | Harga | Stok |");
        System.out.println("-------------------------------------");
        for (Barang10 barang : BARANGS) {
            System.out.println(barang);
        }
        System.out.println("-------------------------------------");
    }private static void Beli() {
        System.out.println("========== Daftar Barang ===========");
        System.out.println("| Kode | Nama Barang | Harga | Stok |");
        System.out.println("-------------------------------------");
        for (Barang10 barang : BARANGS) {
            System.out.println(barang);
        }
        System.out.println("-------------------------------------");
    }

    private static void lakukanPembelian(Scanner scanner) {
        System.out.println("========== Lakukan Pembelian ===========");
        System.out.println("| Kode | Nama Barang | Harga | Stok |");
        System.out.println("-------------------------------------");

        
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();

        Barang10 barang = cariBarang(kodeBarang);
        if (barang != null) {
            System.out.println("Nama Barang: " + barang.getNama());
            System.out.println("Harga: Rp" + barang.getHarga());
            System.out.println("Jumlah yang ingin dibeli: ");
            int jumlah = scanner.nextInt();

            if (jumlah <= barang.getStok()) {
                int totalHarga = jumlah * barang.getHarga();
                System.out.println("Total Harga: Rp" + totalHarga);

                System.out.println("Apakah Anda ingin membeli barang ini? (y/t)");
                String konfirmasi = scanner.nextLine();

                if (konfirmasi.equalsIgnoreCase("y")) {
                    barang.setStok(barang.getStok() - jumlah);
                    System.out.println("Pembelian berhasil!");
                    System.out.println("====== Struk Belanja ======");
                    System.out.println("Nama Barang: " +barang.getNama());
                    System.out.println("Jumlah: " + jumlah);
                    System.out.println("Total Harga: Rp" + totalHarga);
                    System.out.println("Terimakasih telah belanja di Toko Maju Mundur Cantik");
                } else {
                    System.out.println("Pembelian dibatalkan!");
                }
            } else {
                System.out.println("Stok barang tidak mencukupi!");
            }
        } else {
            System.out.println("Barang tidak ditemukan!");
        }
    }

    private static Barang10 cariBarang(String kodeBarang) {
        for (Barang10 barang : BARANGS) {
            if (barang.getKode().equals(kodeBarang)) {
                return barang;
            }
        }
        return null;
    }
    }
