public class Soal8Sampai15 {
    public static void main(String[] args) {

        System.out.print("Soal 8: ");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i % 2 == 1 ? i : j);
            }
        }
        System.out.println();

        System.out.print("Soal 9: ");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i % 2 == 0 ? i : j);
            }
        }
        System.out.println();

        System.out.print("Soal 10: ");
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i % 2 == 0 ? j : i);
            }
        }
        System.out.println();

        System.out.print("Soal 11: ");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i % 2 == 0 ? i : j);
            }
        }
        System.out.println();

        System.out.print("Soal 12: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i == 2 || i >= 5) ? i : j);
            }
        }
        System.out.println();

        System.out.print("Soal 13: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i == 5 || i == 6) ? j : i);
            }
        }
        System.out.println();

        System.out.print("Soal 14: ");
        for (int i = 8; i >= 1; i--) {
            if (i == 6 || i == 5) {
                for (int j = i; j >= 1; j--) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
        }
        System.out.println();

        System.out.print("Soal 15: ");
        for (int i = 8; i >= 1; i--) {
            if (i >= 7 || i == 4 || i == 3) {
                for (int j = i; j >= 1; j--) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
        }
        System.out.println();
    }
}