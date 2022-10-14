import java.util.Scanner;

public class Tugas6_1 {
    public static void main(String[] args) {
        int a;
        while(true) {
            try {
                System.out.printf("Masukkan Nilai awal : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai awal harus berformat nomor!\n");
            }
        }
        
        for(int i = 0; i < a; i++){
            for(int j = a - 1; j >= i; j--) System.out.printf(" ");
            for(int j = 0; j <= i; j++) System.out.printf("* ");
            System.out.println();
        }
    }
}