import java.util.Scanner;

public class Tugas6_17 {
    public static void main(String[] args) {
        int a = 0, i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, jumlah = 0;
        System.out.println("Program Nilai Mahasiswa\n");
        while(true) {
            try {
                System.out.printf("Masukkan Jumlah Data : ");
                Scanner scnJ = new Scanner(System.in);
                jumlah = scnJ.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nJumlah harus berformat nomor!\n");
            }
        }

        for(i = 1; i <= jumlah; i++) {
            while(true) {
                try {
                    System.out.printf("Masukkan Nilai ke-" + i + " : ");
                    Scanner scnA = new Scanner(System.in);
                    int input = scnA.nextInt();
                    if(input > max) max = input;
                    if(input < min) min = input;
                    a += input;
                    break;
                } catch (Exception e) {
                    System.out.println("\nInput harus berformat nomor!\n");
                }
            }
        }       
        
        System.out.println("\nNilai Total : " + a);
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
        System.out.println("Nilai Rata-Rata : " + (double)a/(double)jumlah);
    }
}