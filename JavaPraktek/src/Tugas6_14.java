import java.util.Scanner;

public interface Tugas6_14 {
    public static void main(String[] args) {
        String a; 
        while(true) {
            System.out.printf("Masukkan Input : ");
            Scanner scnA = new Scanner(System.in);
            a = scnA.nextLine();
            break;
        }

        System.out.println("Output : " + a);
    }
}
