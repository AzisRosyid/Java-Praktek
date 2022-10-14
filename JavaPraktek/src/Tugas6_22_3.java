import java.util.Scanner;

public class Tugas6_22_3 {
    public static void main(String[] args) {
        while(true) {
            int a; boolean loop = false;
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