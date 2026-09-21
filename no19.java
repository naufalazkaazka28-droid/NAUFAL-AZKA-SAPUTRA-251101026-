public class Soal19 {
    public static void main(String[] args) {
        int val = 3;
        for (int i = 0; i < 5; i++) {
            System.out.print(val + " ");
            val *= 3;
            System.out.print(val + " ");
            val -= 5;
        }
        System.out.println();
    }
}