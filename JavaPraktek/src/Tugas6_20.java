import java.util.Scanner;

public class Tugas6_20 {
    public static void main(String[] args) {
        int a;
        while(true) {
            try {
                System.out.printf("Masukkan Nilai n : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nNilai awal harus berformat nomor!\n");
            }
        }

        String prima = "";
        int i = 1; int n = 0;
        while(true) {
            if (n >= a) break;
            for(int j = 1; j <= i; j++) {
                if(i == j) {
                    prima += i + " ";
                    n++;
                }
                if (j == 1) continue;
                else if (((double)i/(double)j)==(i/j)) break;
            }
            i++;
        }

        System.out.println("Output : " + prima);
    }
}