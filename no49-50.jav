import java.util.Scanner;

public class SoalPrima {
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();

        int totalPrima = 0;
        System.out.println("\n49. Bilangan Prima dari " + awal + " hingga " + akhir + ":");
        for (int i = awal; i <= akhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
                totalPrima++;
            }
        }
        System.out.println("\n50. Total banyaknya bilangan Prima: " + totalPrima);
    }
}