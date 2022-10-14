import java.util.Scanner;

public class Tugas6_2 {
    public static void main(String[] args) {
        int a;
        int b;
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
        while(true) {
            try {
                System.out.printf("Masukkan Nilai akhir : ");
                Scanner scnB = new Scanner(System.in);
                b = scnB.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai akhir harus berformat nomor!\n");
            }
        }

        String prima = "";
        for(int i = a; i <= b; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == j) prima += i + " ";
                if (j == 1) continue;
                else if (((double)i/(double)j)==(i/j)) break;
            }
        }

        System.out.println("Bilangan prima : " + prima);
    }
}
