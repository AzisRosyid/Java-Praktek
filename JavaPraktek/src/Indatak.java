import javax.swing.JOptionPane;

public class Indatak {
    public static void main(String[] args) {
        String kalimat = JOptionPane.showInputDialog(null, "Ketikan sebuah kalimat", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        String bilbul = JOptionPane.showInputDialog(null, "Masukkan bilangan bulat", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        int bilb = Integer.parseInt(bilbul);
        String bilreal = JOptionPane.showInputDialog(null, "Masukkan bilangan real/pecahan", "Memasukkan Data", JOptionPane.QUESTION_MESSAGE);
        double bilr = Double.parseDouble(bilreal);
        JOptionPane.showMessageDialog(null, kalimat, "Tampilkan Pesan", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, bilb, "Tampilkan Pesan", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, bilr, "Tampilkan Pesan", JOptionPane.QUESTION_MESSAGE);
    }
}
