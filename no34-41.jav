public class AnimasiAngka {
    public static void main(String[] args) throws InterruptedException {
        int lebar = 20;
        
        // Contoh Animasi Horisontal (Soal 34-37)
        System.out.println("--- Animasi Bergerak Kiri ke Kanan ---");
        for (int i = 0; i < lebar; i++) {
            System.out.print("\r"); // Memindahkan kursor balik ke awal baris
            for (int j = 0; j < i; j++) System.out.print(" ");
            System.out.print("0");
            Thread.sleep(100);
        }
        System.out.println();
    }
}