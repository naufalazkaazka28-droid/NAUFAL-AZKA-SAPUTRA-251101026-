import java.util.Scanner;

public class Soal22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.print(n + "! = ");
        long hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            System.out.print(i + (i > 1 ? " x " : ""));
        }
        System.out.println(" = " + hasil);
    }
}