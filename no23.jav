import java.util.Scanner;

public class Soal23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai maksimum: ");
        int max = scanner.nextInt();

        int a = 0, b = 1;
        while (a <= max) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}