import java.util.Scanner;

public class Tugas1Tampil {
    private static String name, nim, address;

    public static void main(String[] args) {
        // Input Data
        // Nama
        name = "Azis Rosyid"; 
        // NIM
        nim = "22520241011"; 
        // Alamat
        address = "Kragilan RT 01/RW 08, Sinduadi, Mlati, Sleman, DIY";

        // Jika ingin Input Data menggunakan Console maka tambahkan method : inputConsole();
        // inputConsole();

        // Tampilkan Data
        System.out.println("Nama : " + name);
        System.out.println("NIM : " + nim);
        System.out.println("Address : " + address);
    }

    private static void inputConsole() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Data Nama : ");
        name = scn.nextLine();
        while(true) {
            try {
                System.out.print("Masukkan Data NIM : ");
                nim = scn.nextLine();
                Long.parseLong(nim);
                break;
            } catch (Exception e) {
                System.out.println("\nData NIM harus berformat nomor!\n");
            }
        }
        System.out.print("Masukkan Data Alamat : ");
        address = scn.nextLine();
    }
}
