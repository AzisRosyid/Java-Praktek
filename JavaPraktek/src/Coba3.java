public class Coba3 {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = false;
        boolean C = false;
        boolean D = false;

        System.out.println("X = " + ((!A||B)&&(A||B||D)&&!D));
        System.out.println("X = " + (B&&!D));
        System.out.println("Y = " + (A&&B&&C||A&&!B&&C||!A));
        System.out.println("Y = " + (A&&C||!A));

        System.out.println("Y = " + ((!A&&!C)||(B&&C)||(!B&&!C)));
    }
}
