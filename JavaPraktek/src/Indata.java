import java.util.Scanner;

public class Indata {
    public static void main(String[] args) {
        System.out.printf("Masukkan Data teks: ");
        try (Scanner scn = new Scanner(System.in)) {
            String kata = scn.next();
            System.out.printf("masukkan Data bilangan bulat : ");
            int bilbul = scn.nextInt();
            System.out.printf("Masukkan Data bilangan real/pecahan : ");
            double bilr = scn.nextDouble();
            System.out.println("Teks yang adan masukkan : " + kata);
            System.out.println("Bilangan bulat yang anda masukkan : " + bilbul);
            System.out.println("Bilangan real yang anda masukkan : " + bilr);
        }
    }
}
