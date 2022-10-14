import java.util.Scanner;

public class Tugas6_22_4 {
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
    
            String bil = "";
            int i = 0, n = 0; 
            while(true) {
                if (n >= a) break;
                i += n;
                bil += i + " ";
                n++;
            }
            System.out.println("Output : " + bil);
            
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
