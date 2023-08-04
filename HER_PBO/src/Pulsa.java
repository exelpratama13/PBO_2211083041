/*
	Pembuat	: EXEL PRATAMA
	NIM	: 2211083041
	Tanggal : 4 Agustus 2023
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package HER_PBO_2211083041;

/**
 *
 * @author EXEL PRATAMA
 */
public class Pulsa{
    private final String kodeFaktur;
    private final String namaPelanggan;
    private final String tanggalBeli;
    private final String kartu;
    private final double nilaiPulsa;
    private final double diskon;
    private final double total;

    public Pulsa(String kodeFaktur, String namaPelanggan, String tanggalBeli, String kartu, double nilaiPulsa) {
        this.kodeFaktur = kodeFaktur;
        this.namaPelanggan = namaPelanggan;
        this.tanggalBeli = tanggalBeli;
        this.kartu = kartu;
        this.nilaiPulsa = nilaiPulsa;

        //hitung diskon
        if (this.nilaiPulsa > 200000) {
            this.diskon = this.nilaiPulsa * 0.05;
        } else {
            this.diskon = 2000;
        }

        //hitung total
        this.total = this.nilaiPulsa - this.diskon;
    }

    public String getKodeFaktur() {
        return kodeFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTanggalBeli() {
        return tanggalBeli;
    }

    public String getKartu() {
        return kartu;
    }

    public double getNilaiPulsa() {
        return nilaiPulsa;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Pulsa pulsa1 = new Pulsa("f001", "feri", "01-01-2015", "mentari", 10000);
        Pulsa pulsa2 = new Pulsa("f002", "deni", "01-01-2015", "xl", 10000);

        System.out.println("Kode Faktur: " + pulsa1.getKodeFaktur());
        System.out.println("Nama Pelanggan: " + pulsa1.getNamaPelanggan());
        System.out.println("Tanggal Beli: " + pulsa1.getTanggalBeli());
        System.out.println("Kartu: " + pulsa1.getKartu());
        System.out.println("Nilai Pulsa: " + pulsa1.getNilaiPulsa());
        System.out.println("Diskon: " + pulsa1.getDiskon());
        System.out.println("Total: " + pulsa1.getTotal());

        System.out.println("\nKode Faktur: " + pulsa2.getKodeFaktur());
        System.out.println("Nama Pelanggan: " + pulsa2.getNamaPelanggan());
        System.out.println("Tanggal Beli: " + pulsa2.getTanggalBeli());
        System.out.println("Kartu: " + pulsa2.getKartu());
        System.out.println("Nilai Pulsa: " + pulsa2.getNilaiPulsa());
        System.out.println("Diskon: " + pulsa2.getDiskon());
        System.out.println("Total: " + pulsa2.getTotal());
    }
}