public class Soal17 {
    public static void main(String[] args) {
        int val = 2;
        for (int i = 0; i < 5; i++) {
            System.out.print(val + " ");
            val += 10;
            System.out.print(val + " ");
            val -= 5;
        }
        System.out.println();
    }
}