import java.util.Scanner;
	
public class Tugas4Bitwise {
	public static void main(String[] args) {
        // Input Data
	    int a;
	    int b;
	    while(true) {
            try {
                System.out.printf("Masukkan Nilai a : ");
                Scanner scnA = new Scanner(System.in);
	            a = scnA.nextInt();
	            break;
	        } catch (Exception e) {
	            System.out.println("\nNilai a harus berformat nomor!\n");
	        }
	    }
	    while(true) {
	        try {
	            System.out.printf("Masukkan Nilai b : ");
	            Scanner scnB = new Scanner(System.in);
	            b = scnB.nextInt();
	            break;
	        } catch (Exception e) {
	           System.out.println("\nNilai b harus berformat nomor!\n");
	        }
	    }
	
	    // Proses
	    int c = a & b;
	    int d = a | b;
	    int e = a ^ b;
        int f = ~a;
        int g = ~b;
        int h = a<<2;
        int i = b<<2;
        int j = a>>2;
        int k = b>>2;
        int l = a>>>2;
        int m = b>>>2;
	
	    // Tampilkan
	    System.out.println("\nPenggunaan Operator Bitwise");
	    System.out.println("Nilai awal a adalah : " + a);
	    System.out.println("Nilai awal b adalah : " + b);
	    System.out.println("\nHasil dari a & b = " + c);
	    System.out.println("Hasil dari a | b = " + d);
	    System.out.println("Hasil dari a ^ b = " + e);
        System.out.println("Hasil dari ~a = " + f);
	    System.out.println("Hasil dari ~b = " + g);
        System.out.println("Hasil dari a<<2 = " + h);
	    System.out.println("Hasil dari b<<2 = " + i);
        System.out.println("Hasil dari a>>2 = " + j);
	    System.out.println("Hasil dari b>>2 = " + k);
        System.out.println("Hasil dari a>>>2 = " + l);
	    System.out.println("Hasil dari b>>>2 = " + m);
	}
}
