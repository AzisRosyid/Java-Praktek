public class Tugas7_1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = new char[10][12];

        String[] city = {"banten", "jakarta", "bandung", "cirebon", "bogor", "pekalongan", "semarang", "surabaya", "malang", "tegal"};
        for (int i = 0; i < city.length; i++) {
            char[] cityName = city[i].toUpperCase().toCharArray();
            for (int j = 0; j < cityName.length; j++) KOTA[i][j] = cityName[j];
        }

        for (int i = 0; i < KODE.length; i++) {
            String cityName = "";
            for (char j: KOTA[i]) cityName += j + " ";
            System.out.printf("%s | %s\n", KODE[i], cityName);
        }
    }
}
