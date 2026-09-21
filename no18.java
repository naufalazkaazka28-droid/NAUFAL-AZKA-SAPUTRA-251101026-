public class Soal18 {
    public static void main(String[] args) {
        int val = 5;
        for (int i = 0; i < 6; i++) {
            System.out.print(val + " ");
            val -= 3;
            System.out.print(val + " ");
            val += 5;
        }
        System.out.println();
    }
}