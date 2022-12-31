import javax.swing.JOptionPane;

public class Tugas8_5 {
    public static void main(String[] args) {
        final int jumlahMahasiswa = 5;
        final String title = "Program Nilai Akhir dan Huruf";
        JOptionPane.showMessageDialog(null, "Program Menghitung NILAI AKHIR serta NILAI HURUF\ndari " + jumlahMahasiswa + " orang mahasiswa di kelas TK1C", title, JOptionPane.INFORMATION_MESSAGE);

        final String[] jenisInput = {"Nomor Induk Mahasiswa", "Nilai Tugas", "UTS", "UAS"};
        final double[] bebanInput = {0, .2, .3, .5};
        long[][] data = new long[jumlahMahasiswa][jenisInput.length];
        int[] order = new int[jumlahMahasiswa];
        String output = "";
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < data[i].length; j++) {
                while (true) {
                    try {
                        data[i][j] = Long.parseLong(JOptionPane.showInputDialog(null, "Masukkan " + jenisInput[j], "Mahasiswa ke-" + (i + 1), JOptionPane.QUESTION_MESSAGE));
                        break;
                    } catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Input yang dimasukkan harus berformat nomor!", "Error: Kesalahan Format Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            order[i] = i;
        }

        while (true) {
            boolean stop = true;
            for (int i = 1; i < jumlahMahasiswa; i++) {
                double value = nilaiAkhir(data[order[i]], bebanInput);
                double back = nilaiAkhir(data[order[i-1]], bebanInput);
                if (value > back) {
                    int temp = order[i];
                    order[i] = order[i-1];
                    order[i-1] = temp;
                    stop = false;
                }
            }
            if (stop) break;
        }

        for (int i: order) {
            output += "\n    Nomor Induk : " + data[i][0];
            output += "\n    Nilai Akhir : " + nilaiAkhir(data[i], bebanInput);
            output += "\n    Nilai Huruf : " + nilaiHuruf(nilaiAkhir(data[i], bebanInput));
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, "Output : " + output, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private static char nilaiHuruf(double nilai) {
        if (nilai >= 80) return 'A';
        else if (nilai >= 70) return 'B';
        else if (nilai >= 60) return 'C';
        else if (nilai >= 40) return 'D';
        else return 'E';
    }

    private static double nilaiAkhir(long[] nilai, double[] beban) {
        double hasil = 0;
        for (int i = 0; i < nilai.length; i++) hasil += nilai[i] * beban[i];
        return hasil;
    }
}
