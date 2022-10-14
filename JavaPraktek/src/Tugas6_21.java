import java.util.Scanner;

public class Tugas6_21 {
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

        String bil = "";
        int i = 0, n = 0; 
        while(true) {
            if (n >= a) break;
            i += n;
            bil += i + " ";
            n++;
        }

        System.out.println("Output : " + bil);
    }
}
