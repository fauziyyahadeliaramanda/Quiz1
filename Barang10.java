public class Barang10 {

    private String kode;
    private String nama;
    private int harga;
    private int stok;

    public Barang10(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return String.format("| %-5s | %-20s | Rp %-8d | %-5d |", kode, nama, harga, stok);
    }
}