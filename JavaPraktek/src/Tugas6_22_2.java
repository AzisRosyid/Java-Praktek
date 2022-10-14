import java.util.Scanner;

public class Tugas6_22_2 {
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
            System.out.println("Patter 0");
            for(int i = 1; i <= a; i++) {
                for(int j = 1; j <= i; j++) System.out.print(i + " ");
                System.out.println();
            }
            System.out.println("\nPattern I");
            for(int i = 1; i <= a; i++) {
                for(int j = 1; j <= i; j++) System.out.print(j + " ");
                System.out.println();
            }
            System.out.println("\nPattern II");
            for(int i = a; i >= 1; i--) {
                for(int j = 1; j <= i; j++) System.out.print(j + " ");
                System.out.println();
            }
            System.out.println("\nPattern III");
            for(int i = 1; i <= a; i++) {
                for(int j = a; j > i; j--) System.out.print("  ");
                for(int j = i; j >= 1; j--) System.out.print(j + " ");
                System.out.println();
            }
            System.out.println("\nPattern IV");
            for(int i = a; i >= 1; i--) {
                for(int j = a; j > i; j--) System.out.print("  ");
                for(int j = 1; j <= i; j++) System.out.print(j + " ");
                System.out.println();
            }
            System.out.println("\nPattern V");
            for(int i = 0; i <= a; i++) {
                int spc = String.valueOf(Math.pow(2, a)).length() + 1;
                for(int j = a; j > i; j--) System.out.print(" ".repeat(spc - 2));
                for(int j = 0; j <= i; j++) {
                    if(j > 0) System.out.print(" ".repeat(spc - String.valueOf(Math.pow(2, j)).length()));
                    System.out.print((int)Math.pow(2, j));
                } 
                for(int j = i - 1; j >= 0; j--) System.out.print(" ".repeat(spc - String.valueOf(Math.pow(2, j)).length()) + (int)Math.pow(2, j));
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
