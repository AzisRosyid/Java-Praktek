import java.util.Scanner;

public class Tugas6_8 {
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

        System.out.print("Output : ");
        for(int i = 1; i <= a; i++) System.out.print((i % 2 == 0 ? -i : i) + " ");
    }
}
