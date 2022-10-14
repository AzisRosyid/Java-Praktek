import java.util.Scanner;

public class Tugas6_4 {
    public static void main(String[] args) {
        int a;
        while(true) {
            try {
                System.out.printf("Masukkan Bilangan Triangular : ");
                Scanner scnA = new Scanner(System.in);
                a = scnA.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("\nBilangan harus berformat nomor!\n");
            }
        }

        String bil = "";
        int hasil = 0;
        for(int i = a; i >= 1; i--) {
            bil += i; 
            if(i > 1) bil += " + ";
            hasil += i;
        }

        System.out.println("Hasil dari : " + bil);
        System.out.println("Adalah : " + hasil);
    }
}
