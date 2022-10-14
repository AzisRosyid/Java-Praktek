import java.util.Scanner;
	
public class Tugas4Logika {
	public static void main(String[] args) {
        // Input Data
	    boolean a;
	    boolean b;
	    while(true) {
            try {
                System.out.printf("Masukkan Nilai a : ");
                Scanner scnA = new Scanner(System.in);
	            a = scnA.nextBoolean();
	            break;
	        } catch (Exception e) {
	            System.out.println("\nNilai a harus berformat boolean!\n");
	        }
	    }
	    while(true) {
	        try {
	            System.out.printf("Masukkan Nilai b : ");
	            Scanner scnB = new Scanner(System.in);
	            b = scnB.nextBoolean();
	            break;
	        } catch (Exception e) {
	           System.out.println("\nNilai b harus berformat boolean!\n");
	        }
	    }
	
	    // Proses
	    boolean c = a && b;
	    boolean d = a || b;
	    boolean e = !a;
	    boolean f = !b;
	
	    // Tampilkan
	    System.out.println("\nPenggunaan Operator Logika");
	    System.out.println("Nilai awal a adalah : " + a);
	    System.out.println("Nilai awal b adalah : " + b);
	    System.out.println("\nHasil dari a && b = " + c);
	    System.out.println("Hasil dari a || b = " + d);
	    System.out.println("Hasil dari !a = " + e);
	    System.out.println("Hasil dari !b = " + f);
	}
}
