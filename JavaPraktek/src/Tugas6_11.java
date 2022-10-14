import java.util.Scanner;

public class Tugas6_11 {
    public static void main(String[] args) {
        int a = 0, i = 1;
        while(true) {
            while(true) {
                try {
                    System.out.printf("Masukkan Input ke-" + i + " : ");
                    Scanner scnA = new Scanner(System.in);
                    a += scnA.nextInt();
                    i++;
                    break;
                } catch (Exception e) {
                    System.out.println("\nInput harus berformat nomor!\n");
                }
            }
            System.out.printf("Mau memasukkan data lagi [y/t] ? ");
            Scanner scnC = new Scanner(System.in);
            String confirm = scnC.next();
            if(confirm.equals("t")) break;
        }       
        System.out.println("Total Bilangan : " + a);
    }
}
