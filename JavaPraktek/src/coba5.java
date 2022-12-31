import java.util.ArrayList;
import java.util.List;

public class coba5 {
    public static void main(String args[]) {
        byte ascii[] = {65,66,67,68,69,70,71,72,73,74,75};
String str1 = new String(ascii);
String str2 = new String(ascii,2,3);
char[] haloArray = { ' ', 'h', 'a', 'l', 'o', ' ', 'j','a', 'v', 'a', ' ' };
String haloString = new String(haloArray);
String palindrome = "kasur ini rusak";
String kal1 = "Selamat Belajar!";
String kal2 = "Selamat Belajar!";
boolean k1 = kal1.contentEquals(kal2);
boolean k2 = kal1.contentEquals(haloString);
char kar = palindrome.charAt(7);
int nilai = palindrome.codePointAt(7);
int result = kal1.compareTo(kal2);
int result1 = kal2.compareTo(palindrome);
int result2 = palindrome.compareTo(kal1);
int pjkal = palindrome.length();
String gabungan = haloString.concat(kal1);
String str = kal1.copyValueOf(haloArray);
System.out.println(str1); 
System.out.println(str2); 
System.out.println(haloString); 
System.out.println(k1);   
System.out.println(k2); 
System.out.println("Karakter string pada index ke 7 adalah " + kar); 
System.out.println("Unicode karakter n pada index 7 dari kalimat kasur ini rusak adalah: " + nilai); 
System.out.println( "Panjang atau jumlah karakter String adalah : " + pjkal);
System.out.println(result); 
System.out.println(result1); 
System.out.println(result2); 
System.out.println(str); 
System.out.println(gabungan); 
System.out.println(gabungan.toLowerCase()); 
System.out.println(gabungan.toUpperCase()); 
System.out.println("Setelah menggunakan method trim: ");  
System.out.println(gabungan.trim()); 

    }
}
