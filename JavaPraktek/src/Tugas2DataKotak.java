import javax.swing.JOptionPane;

public class Tugas2DataKotak {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Masukkan Nama", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        long nim = Long.parseLong(JOptionPane.showInputDialog(null, "Masukkan NIM", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE));
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, nama, "Tampilkan Data", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, nim, "Tampilkan Data", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, alamat, "Tampilkan Data", JOptionPane.QUESTION_MESSAGE);
    }

    private static void inputOutputConsole() {
        
    }
}
