import java.util.Scanner;

public class Soal1 {
    // Nama  : Azis Rosyid
    // NIM   : 22520241011 (Ganjil)
    // Kelas : E2
    
    public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("PROGRAM MENGHITUNG :\nY = X^n / (1 x 2 x .... x n)");
		System.out.println("=========================================");
    
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nilai X : ");
        int X = scn.nextInt();
        System.out.print("Masukkan Nilai n : ");
        int n = scn.nextInt();
        String hasil = "Y = ";        
        double Y = 1, bagi = 1; int i = 1;
        hasil += X + "^" + n + " / (";
        while(i <= n) {
            bagi *= i;
            hasil += i;
            if (i < n) hasil += " x ";
            i++;
        }
        hasil += ") = ";
        i = n;
        while(i > 0) {
            Y *= X;
            i--;
        }
        hasil += (long)Y + " / " + (long)bagi + " = " + (Y/bagi);
        System.out.println("\nHasil : \n" + hasil);
    }
}