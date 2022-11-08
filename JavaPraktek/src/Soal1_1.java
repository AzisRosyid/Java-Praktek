import java.util.Scanner;

public class Soal1_1 {
    public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("PROGRAM MENGHITUNG :\nY = (2 x .... x n prima) / (1 x 2 x .... x n)");
		System.out.println("=========================================");
    
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nilai n : ");
        int n = scn.nextInt();
        String hasil = "Y = ";        
        double Y = 1, bagi = 1; int i = 1;
        hasil += "(";
        do {
            if (i > n) break;
            for(int j = 2; j <= i; j++) {
                if(i == j) {
                    if (i > 2) hasil += " x ";
                    hasil += i;
                    Y *= i;
                }
                if (j == 1) continue;
                else if (((double)i/(double)j)==(i/j)) break;
            }
            i++;
        } while(true);
        hasil += ") / (";
        i = 1;
        do {
            bagi *= i;
            hasil += i;
            if (i < n) hasil += " x ";
            i++;
        } while(i <= n);
        hasil += ") = ";
        hasil += (long)Y + " / " + (long)bagi + " = " + (Y/bagi);
        System.out.println("\nHasil : \n" + hasil);
    }
}