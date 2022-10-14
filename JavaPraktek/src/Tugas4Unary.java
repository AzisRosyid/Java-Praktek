import java.util.Scanner;
	
public class Tugas4Unary {
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
	    int c = a;
        c = ++c;
	    int d = b;
        d = ++d;
	    int e = a;
        e = e++;
	    int f = b;
        f = f++;
	    int g = a;
        g = --g;
	    int h = b;
        h = --h;
        int i = a;
        i = i--;
        int j = b;
        j = j--;

	
	    // Tampilkan
	    System.out.println("\nPenggunaan Operator Unary (Increment & Decrement)");
	    System.out.println("Nilai awal a adalah : " + a);
	    System.out.println("Nilai awal b adalah : " + b);
	    System.out.println("\nHasil dari ++a = " + c);
	    System.out.println("Hasil dari ++b = " + d);
	    System.out.println("Hasil dari a++ = " + e);
	    System.out.println("Hasil dari b++ = " + f);
	    System.out.println("Hasil dari --a = " + g);
	    System.out.println("Hasil dari --b = " + h);
        System.out.println("Hasil dari a-- = " + i);
	    System.out.println("Hasil dari b-- = " + j);
	}
}
