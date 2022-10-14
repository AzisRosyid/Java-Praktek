public class Coba {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;
        boolean C = true;
        boolean D = false;

        // System.out.println((A||!B)&&(B||C)&&B);
        // System.out.println(A&&B);

        // System.out.println(((A || D) && (B || C)) == (A&&B||A&&C||B&&D||C&&D));

        System.out.println(!A&&B&&!C||A&&!B&&C||A&&B&&!C||A&&B&&C);
        System.out.println(A&&B||B&&!C||A&&C);
        System.out.println(B&&!C||A&&C);
        System.out.println(A&&B);

        // System.out.println(!(A&&B)&&(A||B));
        // System.out.println(!A&&B||A&&!B);

        // int[][] nilai = {{1,70,11},{2,85},{3,90,22,33},{4},{5,85,55}};
        // System.out.println(nilai[1][1]);
    }
}
