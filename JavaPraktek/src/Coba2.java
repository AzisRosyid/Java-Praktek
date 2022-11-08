import java.util.*;

public class Coba2 {
   public static void main(String[] args) throws StringIndexOutOfBoundsException {
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan nama: ");
      String nama = in.nextLine();
      int tt = nama.length() / 2;
      for (int i = tt; i >= 0; i--) {
         for (int j = 1; j <= i; j++) {  
            System.out.print(" ");
         }
         System.out.print(nama.substring(i, i+1));
         for (int pentung  = 1; pentung < -2 * i + (2 * tt + 1) ; pentung++) {
             System.out.print(" ");
         }
         if (i == tt) {
            System.out.print("");

         } else {
            if (i != 0) {
               if (nama.length() % 2 != 0) {
                  System.out.print(nama.substring(nama.length()-i-1, nama.length()-i));
               } else {
                  System.out.print(nama.substring(nama.length()-i, nama.length()-i+1));
               }
            }

         }
         System.out.println();
      }     
   }
}