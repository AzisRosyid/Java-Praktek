import java.util.Scanner;

public class Tugas6_18 {
    public static void main(String[] args) {
        int a;
        while(true) {
            try {
                System.out.printf("Masukkan Input : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nInput harus berformat nomor!\n");
            }
        }

        System.out.println("Output : ");
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <=a; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}