import java.util.Scanner;

public class Tugas6Teori_5 {
    public static void main(String[] args) {
        int[] data = new int[10];
        for(int i = 0; i < data.length; i++) {
            while(true) {
                try {
                    System.out.printf("Masukkan Angka " + (i + 1) + " : ");
                    Scanner scnData = new Scanner(System.in);
                    data[i] = scnData.nextInt();
                    break;
                } catch (Exception e) {
                   System.out.println("\nAngka harus berformat nomor!\n");
                }
            }
        }
        float rata = 0;
        for(int i: data) rata += i;
        rata /= data.length;

        System.out.println("\nRata-ratanya adalah : " + rata);
    }
}
