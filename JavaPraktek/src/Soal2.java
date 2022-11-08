import java.util.Scanner;

public class Soal2 {
    // Nama  : Azis Rosyid
    // NIM   : 22520241011 (Ganjil)
    // Kelas : E2

    public static void main(String[] args) {
        System.out.println("======================\nPROGRAM MENAMPILKAN NAMA\n======================");

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = scn.nextLine();
        System.out.println();
        int start = nama.length() / 2;
        for (int i = 0; i < nama.length() / 2; i++) {
            if ((nama.length() % 2 == 1) && i <= 0) {
                for (int j= 0; j <= start - i - 1; j++) System.out.print(" ");
                System.out.println(nama.charAt(start));
            }
            for (int j= 0; j <= start - (i + 2); j++) System.out.print(" ");
            System.out.print(nama.charAt(start - i - 1));
            for (int j= 0; j < (i * 2) + 1; j++) System.out.print(" ");
            if (nama.length() % 2 == 1) System.out.print(nama.charAt(start + i + 1) + "\n");
            else System.out.print(nama.charAt(start + i) + "\n");
        }
        System.out.println("\nJumlah Karakter : " + nama.length());
        String karakter = "";
        int jumlah = 0;
        for (int i = 0; i < nama.length(); i++) {
            int hitung = 0;
            for (int j = 0; j < nama.length(); j++) if (nama.charAt(i) == nama.charAt(j)) hitung++;
            if (jumlah < hitung) {
                karakter = String.valueOf(nama.charAt(i));
                jumlah = hitung;
            } else if (jumlah == hitung && !karakter.contains(String.valueOf(nama.charAt(i)))) karakter += nama.charAt(i);
        }
        for (char i: karakter.toCharArray()) {
            char min = ' ';
            for (char j: karakter.toCharArray()) if (i < j && !karakter.contains(String.valueOf(j)))karakter += min;
        }
        int karIndex = 0;
        String sortKarakter = "";
        while(true) {
            for(char i: karakter.toCharArray()) {
                int index = 0;
                for(char j: karakter.toCharArray()) if(i > j) index++;
                if (index == karIndex) {
                    sortKarakter += i;
                    karIndex++;
                }
            }
            if (karIndex > karakter.length() - 1) break;
        }

        System.out.println("Karakter Terbanyak : " + sortKarakter + " (Jumlah Karakter : " + jumlah + ")");
    }
}
