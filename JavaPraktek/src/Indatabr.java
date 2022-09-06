import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Indatabr {
    public static void main(String[] args) {
        BufferedReader dataIntek = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        System.out.print("Masukkan Nama Anda : ");
        try {
            nama = dataIntek.readLine();
        } catch (Exception e) {
            System.out.println("Error!");
        }
        System.out.println("Hallo " + nama + "!");
        BufferedReader dataInbilb = new BufferedReader(new InputStreamReader(System.in));
        String bb = "";
        int bilbul = 0;
        System.out.print("Masukkan Suatu Bilangan Bulat : ");
        try {
            bb = dataInbilb.readLine();
            bilbul = Integer.parseInt(bb);
        } catch(Exception e) {
            System.out.println("Error!");
        }
        System.out.println("Bilangan Bulat yang anda masukkan : " + bilbul);
        BufferedReader dataInbilr = new BufferedReader(new InputStreamReader(System.in));
        String br = "";
        double bilr = 0;
        System.out.print("Masukkan Suatu Bilangan Real : ");
        try {
            br = dataInbilr.readLine();
            bilr = Double.parseDouble(br);
        } catch(Exception e) {
            System.out.println("Error!");
        }
        System.out.println("Bilangan Real yang anda masukkan : " + bilr);
    }
}
