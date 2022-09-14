import java.util.Scanner;

public class Tugas2Console {
    public static void main(String[] args) {
        // Input Data
        System.out.printf("Masukkan Data Nama : ");
        Scanner scnNama = new Scanner(System.in);
        String nama = scnNama.nextLine();
        String nim;
        while(true) {
            try {
                System.out.printf("Masukkan Data NIM : ");
                Scanner scnNIM = new Scanner(System.in);
                nim = scnNIM.nextLine();
                Long.parseLong(nim);
                break;
            } catch (Exception e) {
                System.out.println("\nData NIM harus berformat nomor!\n");
            }
        }
        System.out.printf("Masukkan Data Alamat : ");
        Scanner scnAlamat = new Scanner(System.in);
        String alamat = scnAlamat.nextLine();

        // Tampilkan Data
        System.out.println("\nTampilkan Data Nama : " + nama);
        System.out.println("Tampilkan Data NIM : " + nim);
        System.out.println("Tampilkan Data Alamat : " + alamat);
    }
}
