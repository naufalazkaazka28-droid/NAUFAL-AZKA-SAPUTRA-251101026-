public class Soal16 {
    public static void main(String[] args) {
        int val = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print(val + " ");
            val += 4;
            System.out.print(val + " ");
            val -= 2;
        }
        System.out.println();
    }
}