import java.util.Scanner;

public class Tugas6_10 {
    public static void main(String[] args) {
        int i = 1;
        String output = "";
        while(true) {
            System.out.printf("Masukkan Input "+ i +" : ");
            Scanner scnA = new Scanner(System.in);
            if (i > 1) output += " ";
            output += scnA.nextLine();
            if(output.contains("X")) break;
            i++;
        }
        output = output.substring(0, output.indexOf("X") + 1);
        System.out.println("Output : " + output);
    }
}
