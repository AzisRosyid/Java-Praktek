public class Tugas5Continue {
    public static void main(String[] args) {
        String[] negara = {"Germany", "Taiwan", null, "Singapore", "United States", "Brazil", null, "", "France"};
        for(int i = 0; i < negara.length; i++) {
            if (negara[i] == null || negara[i] == "") continue;
            System.out.println("Negara[" + i + "] : " + negara[i]);
        }
    }
}
