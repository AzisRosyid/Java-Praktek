import java.util.Scanner;
	
public class Tugas4Aritmatika {
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
	    int c = a + b;
	    int d = a - b;
	    int e = a / b;
	    double f = (double) a / b;
	    int g = a * b;
	    int h = a % b;
	
	    // Tampilkan
	    System.out.println("\nPenggunaan Operator Aritmatika ");
	    System.out.println("Nilai awal a adalah : " + a);
	    System.out.println("Nilai awal b adalah : " + b);
	    System.out.println("\nHasil dari a + b = " + c);
	    System.out.println("Hasil dari a - b = " + d);
	    System.out.println("Hasil dari a / b = " + e);
	    System.out.println("Hasil dari a / b = " + f);
	    System.out.println("Hasil dari a * b = " + g);
	    System.out.println("Hasil dari a % b = " + h);
	}
}
