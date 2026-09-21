import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.print("Masukkan huruf yang dicari: ");
        char cari = scanner.next().charAt(0);
        
        int jumlah = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == cari) {
                jumlah++;
            }
        }
        System.out.println("Jumlah huruf '" + cari + "': " + jumlah);
    }
}