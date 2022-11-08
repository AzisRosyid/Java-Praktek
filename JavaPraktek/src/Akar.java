import java.util.Scanner;

public class Akar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println(" PROGRAM MENGHITUNG AKAR-AKAR PERSAMAAN KUADRAT (PK) X1 DA X2 ");
        System.out.println("================================================================");
        System.out.println(" PK : ax^2 + bx + c = 0 ");
        System.out.println("--------------------------------");

        //deklarasi nilai a,b,c, dan determinan
        int a,D,b, c;
        double x1, x2;
        System.out.println(" Masukan/input :");
        System.out.printf(" Nilai Konstanta a = ");
        a = scn.nextInt();
        System.out.printf(" Nilai Konstanta b = ");
        b = scn.nextInt();
        System.out.printf(" Nilai Konstanta c = ");
        c = scn.nextInt();
        
        D = b*b-4*a*c;
        if (D > 0) {
            
        }
    }
}
