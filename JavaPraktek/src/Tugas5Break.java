public class Tugas5Break {
    public static void main(String[] args) {
        String[] daerah = {"Yogyakarta", "DKI Jakarta", "Surabaya", "Bandung", "Semarang"};
        int i = 0;
        while(true) {
            if (i >= daerah.length) break;
            System.out.println("Daerah [" + i + "] : " + daerah[i]);
            i++;
        }
    }
}
