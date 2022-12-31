import java.util.Scanner;

public class Tugas7_3 {
    public static void main(String[] args) {
        int[] kelas = new int[5];
        int siswa = 0;
        String[] subject = {"Project", "UTS", "UAS"};
        for (int i = 0; i < kelas.length; i++) {
                Scanner scn = new Scanner(System.in);
                System.out.printf("Masukkan jumlah siswa kelas ke-%d : ", i+1);
                kelas[i] = scn.nextInt();
                if (siswa < kelas[i]) siswa = kelas[i];
        }
        
        int[][][] nilai = new int[kelas.length][siswa][subject.length];
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("\nKelas ke-%d : ", i+1);
            for (int j = 0; j < kelas[i]; j++) {
                System.out.printf("\n\tSiswa ke-%d : \n", j+1);
                for (int k = 0; k < subject.length; k++) {
                    Scanner scn = new Scanner(System.in);
                    System.out.printf("\t\tMasukkan nilai %-7s : ", subject[k]);
                    nilai[i][j][k] = scn.nextInt();
                }
            }
        }

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("\nKelas ke-%d : \n", i+1);
            for (int j = 0; j < kelas[i]; j++) {
                double rata = 0;
                for (int k: nilai[i][j]) rata += k;
                System.out.printf("\tNilai rata-rata Siswa ke-%d : %s\n", j+1, rata/subject.length);
            }
        }

    }
}
