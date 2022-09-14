import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas2DataConsole {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Nama : ");
            String nama = br.readLine();
            System.out.print("Masukkan NIM : ");
            Long nim = Long.parseLong(br.readLine());
            System.out.print("Masukkan Alamat : ");
            String alamat = br.readLine();
            System.out.println("\nNama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Alamat : " + alamat);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
