import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM KOMPLAIN LAUNDRY TIDAK LENGKAP ===");

        // Input Data Mahasiswa
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM            : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Asrama         : ");
        String asrama = input.nextLine();

        // Input Laporan
        System.out.print("Masukkan Barang yang Tidak Ada : ");
        String barangHilang = input.nextLine();

        System.out.print("Detail Tambahan (opsional)      : ");
        String detail = input.nextLine();

        // Output Laporan
        System.out.println("\n=== LAPORAN KOMPLAIN ===");
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Asrama          : " + asrama);
        System.out.println("Barang Hilang   : " + barangHilang);
        System.out.println("Detail          : " + detail);
        System.out.println("\nLaporan berhasil dikirim ke bagian Laundry.");

        input.close();
    }
}