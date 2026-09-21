import java.util.Scanner;

public class SoalHabisDibagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();
        System.out.print("Masukkan pembagi (3, 4, 5, 6, atau 7): ");
        int x = sc.nextInt();

        System.out.println("Bilangan habis dibagi " + x + ":");
        for (int i = awal; i <= akhir; i++) {
            if (i % x == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}