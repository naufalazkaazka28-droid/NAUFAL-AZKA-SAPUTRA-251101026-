import java.util.Scanner;

public class SoalOlahAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        System.out.println("Masukkan 10 angka integer:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        int countGenap = 0, countGanjil = 0;

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
            if (num % 2 == 0) countGenap++;
            else countGanjil++;
        }

        System.out.println("\n--- HASIL ---");
        System.out.println("42. Bilangan Terbesar : " + max);
        System.out.println("43. Bilangan Terkecil : " + min);
        System.out.println("44. Jumlah Bil. Genap : " + countGenap);
        System.out.println("45. Jumlah Bil. Ganjil: " + countGanjil);
    }
}