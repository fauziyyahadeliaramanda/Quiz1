public class TransaksiBarang10 {

    private Barang10[] barangs;
    private int totalHarga;

    public TransaksiBarang10(Barang10[] barangs) {
        this.barangs = barangs;
        hitungTotalHarga();
    }

    public Barang10[] getBarangs() {
        return barangs;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    private void hitungTotalHarga() {
        totalHarga = 0;
        for (Barang10 barang : barangs) {
            totalHarga += barang.getHarga();
        }
    }

    public void tampilkanTransaksi() {
        System.out.println("========== Daftar Barang ===========");
        System.out.println("| Kode | Nama Barang | Harga | Stok |");
        System.out.println("-------------------------------------");
        for (Barang10 barang : barangs) {
            System.out.println(barang);
        }
        System.out.println("-------------------------------------");
        System.out.printf("Total Harga: Rp %,d\n", totalHarga);
    }
}