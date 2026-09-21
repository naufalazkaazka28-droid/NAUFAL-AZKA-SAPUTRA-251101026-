public class FormasiPola {
    public static void main(String[] args) {

        System.out.println("=== Formasi 1 ===");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i + j) % 2 == 0 ? "0" : "*");
            }
            System.out.println();
        }

        System.out.println("\n=== Formasi 16 ===");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7 - i; j++) System.out.print("0");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n=== Formasi 20 ===");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(i == j ? "*" : "0");
            }
            System.out.println();
        }
    }
}