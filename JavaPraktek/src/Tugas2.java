import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Tugas2 {
    private static String nama, nim, alamat;
    private final static String dialogInputTitle = "Memasukkan Data";
    private final static String dialogMessageTitle = "Tampilkan Data";

    public static void main(String[] args) {
        inputOutputConsole();
    }

    private static void inputOutputConsole() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Nama : ");
            nama = br.readLine();
            System.out.print("Masukkan NIM : ");
            nim = br.readLine();
            System.out.print("Masukkan Alamat : ");
            alamat = br.readLine();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("\nNama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Alamat : " + alamat);
    }

    private static void inputOutputKotak() {
        nama = JOptionPane.showInputDialog(null, "Masukkan Nama", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);
        nim = JOptionPane.showInputDialog(null, "Masukkan NIM", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);
        alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat", dialogInputTitle, JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, nama, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nim, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, alamat, dialogMessageTitle, JOptionPane.QUESTION_MESSAGE);
    }
}
