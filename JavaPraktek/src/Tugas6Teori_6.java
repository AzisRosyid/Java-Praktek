import java.util.Scanner;

public class Tugas6Teori_6 {
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
        System.out.println();
        int angka;
        while(true) {
            try {
                System.out.printf("Masukkan Angka yang berada pada array : ");
                Scanner scnAngka = new Scanner(System.in);
                angka = scnAngka.nextInt();
                break;
            } catch (Exception e) {
               System.out.println("\nAngka harus berformat nomor!\n");
            }
        }
        for(int i = 0; i < data.length; i++) {
            if (angka == data[i]) {
                System.out.println("\nAngka yang anda masukkan berada pada index : " + i);
                break;
            }
            if (i >= data.length - 1) System.out.println("\nAngka tidak ditemukan.");
        }
    }
}
