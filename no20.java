public class Soal20 {
    public static void main(String[] args) {
        int val = 1;
        int[] step = {1, 2, 3};
        int idx = 0;
        for (int i = 0; i < 13; i++) {
            System.out.print(val + " ");
            val += step[idx];
            idx = (idx + 1) % 3;
        }
        System.out.println();
    }
}