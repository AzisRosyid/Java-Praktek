import java.util.Scanner;

public class Tugas6_17 {
    public static void main(String[] args) {
        int a = 0, i = 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.println("Program Nilai Mahasiswa\n");
        while(true) {
            while(true) {
                try {
                    System.out.printf("Masukkan Nilai ke-" + i + " : ");
                    Scanner scnA = new Scanner(System.in);
                    int input = scnA.nextInt();
                    if(input > max) max = input;
                    if(input < min) min = input;
                    a += input;
                    i++;
                    break;
                } catch (Exception e) {
                    System.out.println("\nInput harus berformat nomor!\n");
                }
            }
            System.out.printf("Mau memasukkan nilai lagi [y/t] ? ");
            Scanner scnC = new Scanner(System.in);
            String confirm = scnC.next();
            if(confirm.equals("t")) break;
        }       
        
        System.out.println("Nilai Total : " + a);
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
        System.out.println("Nilai Rata-Rata : " + (double)a/(double)i);
    }
}