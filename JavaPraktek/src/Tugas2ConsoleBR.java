import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tugas2ConsoleBR {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Input Data
            System.out.print("Masukkan Nama : ");
            String nama = br.readLine();
            System.out.print("Masukkan NIM : ");
            Long nim = Long.parseLong(br.readLine());
            System.out.print("Masukkan Alamat : ");
            String alamat = br.readLine();

            // Tampilkan Data
            System.out.println("\nData Nama : " + nama);
            System.out.println("Data NIM : " + nim);
            System.out.println("Data Alamat : " + alamat);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
