import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tugas7_3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100), d = 1;
        int[] data = new int[a];

        for(int i = 0; i < 10; i++) data[i] = (int)(Math.random()*100);

        // while(true) {
        //     while(true) {
        //         try {
        //             System.out.printf("Masukkan Data ke-" + i + " : ");
        //             Scanner scnA = new Scanner(System.in);
        //             a += scnA.nextInt();
        //             i++;
        //             break;
        //         } catch (Exception e) {
        //             System.out.println("\nData harus berformat nomor!\n");
        //         }
        //     }
        //     System.out.printf("Mau memasukkan data lagi [y/t] ? ");
        //     Scanner scnC = new Scanner(System.in);
        //     String confirm = scnC.next();
        //     if(confirm.equals("t")) break;
        // }

        // Menampilakan Data Awal
        System.out.print("Data Awal : [");
        for(int i: data) {
            System.out.print(i);
            if(i != data[data.length - 1]) System.out.print(", ");
        }
        System.out.print("]\n\n");
        
        // Proses Sorting
        System.out.println("\nProses sorting dengan Quick Sort");
        for(int i = data.length - 1; i > 0; i--) {
            System.out.println("\nIterasi ke-" + (i+1) + "  : ");
            for(int kiri = 0; kiri < i; kiri++) {
                System.out.println("\nData kiri index-" + kiri + " : ");
                int kanan = kiri + 1;
                System.out.println("Data kanan index-" + kanan + " : ");
                System.out.println("\nJika data[kiri]->"+ data[kiri] + " lebih besar dari data[kanan]->" + data[kanan] + ", maka :");
                if(data[kiri] > data[kanan]) {
                    System.out.println(":benar, ");
                    int temp = data[kiri];
                    data[kiri] = data[kanan];
                    data[kanan] = temp;
                } else {
                    System.out.println(":salah, ");
                }
            }
        }
        
        System.out.print("\nData Setelah Disorting : [");
        for(int i: data) {
            System.out.print(i);
            if(i != data[data.length - 1]) System.out.print(", ");
        }
        System.out.print("]\n\n");
    }
}