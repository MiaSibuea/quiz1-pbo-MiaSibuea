import java.util.*;

public class Driver1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        String kode;

        while (true) {
            kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            int porsiButet = Integer.parseInt(input.nextLine());
            int porsiUcok = 2 * porsiButet;
            int totalPorsi = porsiButet + porsiUcok;

            int harga = 0;
            String nama = "";

            switch (kode) {
                case "NGS":
                    nama = "Nasi Goreng Spesial";
                    harga = 15000;
                    break;
                case "AP":
                    nama = "Ayam Penyet";
                    harga = 20000;
                    break;
                case "SA":
                    nama = "Sate Ayam";
                    harga = 25000;
                    break;
                case "BU":
                    nama = "Bakso Urat";
                    harga = 18000;
                    break;
                case "MAP":
                    nama = "Mie Ayam Pangsit";
                    harga = 15000;
                    break;
                case "GG":
                    nama = "Gado-Gado";
                    harga = 15000;
                    break;
            }

            int subtotal = harga * totalPorsi;
            total += subtotal;
        }

        double diskon = 0;
        String kupon = "Tidak ada";

        if (total >= 300000) {
            diskon = 0.15;
            kupon = "Merah";
        } else if (total >= 200000) {
            diskon = 0.10;
            kupon = "Kuning";
        } else if (total >= 100000) {
            diskon = 0.05;
            kupon = "Biru";
        }

        int potongan = (int) (total * diskon);
        int bayar = total - potongan;

        System.out.println("====================================");
        System.out.println("Total\t\t\t" + total);
        System.out.println("Kupon\t\t\t" + kupon);
        System.out.println("Diskon\t\t\t" + potongan);
        System.out.println("Bayar\t\t\t" + bayar);

        input.close();
    }
}