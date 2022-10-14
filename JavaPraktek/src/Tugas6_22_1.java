import java.util.Scanner;

public class Tugas6_22_1 {
    public static void main(String[] args) {
        while(true) {
            int a; boolean loop = false;
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
            
            while(true) {
                System.out.print("\nApakah anda ingin menggunakan program ini lagi (y/t)? ");
                Scanner scnL = new Scanner(System.in);
                String input = scnL.nextLine();
                if(input.equals("y")) loop = true;
                else if(input.equals("t")) loop = false;
                else { 
                    System.out.println("\nInput harus berupa (y/t)!");
                    continue;
                }
                break;
            }
            if(!loop) break;
        }
    }
}
