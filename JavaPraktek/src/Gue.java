import java.util.Scanner;
public class Gue {
    public static void main ( String [] args ) {
        System.out.print("Masukkan Nilai awal : ");
        Scanner hgkue = new Scanner(System.in);
        int kue = hgkue.nextInt();
        System.out.print("Selisih harga : ");
        int beda = hgkue.nextInt();
        System.out.print("Target terjual : ");
        int tg = hgkue.nextInt();
        int jml=0,i=0,h;
        System.out.print("Target Uangku = ");
        do {
            h = kue + (i*beda);
            jml = jml + h;
            if((tg-jml)>(kue+(i*beda))) System.out.print(h + " + ");
            else System.out.print(h);
            i++;
        } while((jml+h)<tg);
            System.out.println(" = " + jml);System.out.println("jumlah kue ada : " + i--);
    }
}