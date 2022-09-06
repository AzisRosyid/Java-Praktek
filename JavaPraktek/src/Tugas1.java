import java.util.Scanner;

public class Tugas1 {
    private static int spc = 70;
    private static String name, nim, date, address;

    public static void main(String[] args) {
        name = "Azis Rosyid"; nim = "22520241011"; date = "Yogyakarta, 24 Mei 2004"; address = "Kragilan RT 01/RW 08, Sinduadi, Mlati, Sleman, DIY";
        for (int i: new int[]{ spc, name.length(), nim.length(), date.length(), address.length() }) if (i > spc) spc = i;

        System.out.println(name);
        for (int j = 0; j < (spc - nim.length() - 1) / 2; j++) System.out.print(" ");
        System.out.println(nim);
        for (int i = 0; i < (spc - date.length()); i++) System.out.print(" ");
        System.out.println(date);
        String[] splitAddr = address.split("\\s");
        int lengthAddr = address.replaceAll("\\s", "").length();
        int[] spaceAddr = new int[splitAddr.length - 1];
        for (int i = 0; i < spc - lengthAddr; i++) spaceAddr[i % (splitAddr.length - 1)] += 1;
        for (int i = 0; i < splitAddr.length; i++) {
            System.out.print(splitAddr[i]);
            if (splitAddr.length > i + 1) System.out.print(" ".repeat(spaceAddr[i]));
        }
    }

    private static void inputConsole() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        name = scn.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = scn.nextLine();
        System.out.print("Masukkan Tempat, Tanggal Lahir : ");
        date = scn.nextLine();
        System.out.print("Masukkan Alamat : ");
        address = scn.nextLine();
    }
}
