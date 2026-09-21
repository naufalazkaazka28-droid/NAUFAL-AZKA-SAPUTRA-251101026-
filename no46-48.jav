import java.util.Scanner;

public class SoalTotalPenjumlahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();

        long totalPositif = 0, totalGenap = 0, totalGanjil = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i > 0) totalPositif += i;
            if (i % 2 == 0) totalGenap += i;
            else totalGanjil += i;
        }

        System.out.println("46. Total Bilangan Positif : " + totalPositif);
        System.out.println("47. Total Bilangan Genap   : " + totalGenap);
        System.out.println("48. Total Bilangan Ganjil  : " + totalGanjil);
    }
}