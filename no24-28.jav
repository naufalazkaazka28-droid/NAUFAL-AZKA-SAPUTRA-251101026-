import java.util.Scanner;

public class SoalKabisat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();
        System.out.print("Masukkan digit akhir (0,2,4,6, atau 8): ");
        int digit = sc.nextInt();

        System.out.println("Tahun Kabisat akhiran " + digit + ":");
        for (int y = awal; y <= akhir; y++) {
            boolean isKabisat = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
            if (isKabisat && Math.abs(y % 10) == digit) {
                System.out.print(y + " ");
            }
        }
        System.out.println();
    }
}