import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        String terbalik = new StringBuilder(kalimat).reverse().toString();
        System.out.println("Hasil terbalik: " + terbalik);
    }
}