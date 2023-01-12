import java.util.Scanner;

// PAS Pratik Pemrograman 1
// ---------------------------------------------
// Nama    : Azis Rosyid
// Prodi   : Pendidikan Teknik Informatika (E2)
// NIM     : 22520241011
// ---------------------------------------------
public class PAS_Azis {
    private final static String[] options = {"Perjumlahan", "Pengurangan", "Perkalian", "Pembagian"};

    private static double[][] matrikA, matrikB, matrikC;
    private static String operator = "";

    public static void main(String[] args) {
        program:
        while (true) {
            System.out.println("==== < Program Operasi Dua Matriks > ==== \nOpsi Program :\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Selesai");
            Scanner scn = new Scanner(System.in);
            System.out.print("\nPilih Opsi : ");
            int opsi = scn.nextInt();
            if (opsi != 1 && opsi != 2 && opsi != 3 && opsi != 4 && opsi != 5) continue program;
            if (opsi == 5) break program;
            konfigurasiOrdo(opsi);
            konfigurasiElemen(opsi);

            switch (opsi) {
                case 1:
                    operator = "+";
                    penjumlahan(matrikA, matrikB);
                    break;
                case 2:
                    operator = "-";
                    pengurangan(matrikA, matrikB);
                    break;
                case 3:
                    operator = "x";
                    perkalian(matrikA, matrikB);
                    break;
                case 4:
                    operator = "x Inverse";
                    pembagian(matrikA, matrikB);
                    break;
                default:
                    break;
            }

            printMatriks(opsi);
            System.out.print("\nTekan Enter untuk Melanjutkan! ");
            Scanner scne = new Scanner(System.in);
            scne.nextLine();
            System.out.println("\n");
        }
    }

    private static void konfigurasiOrdo(int opsi){
        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("\nMasukkan Ordo Matrik A :");
            System.out.print("Masukkan jumlah baris : ");
            int rowA = scn.nextInt();
            System.out.print("Masukkan jumlah kolom : ");
            int colA = scn.nextInt();
            System.out.println("\nMasukkan Ordo Matrik B :");
            System.out.print("Masukkan jumlah baris : ");
            int rowB = scn.nextInt();
            System.out.print("Masukkan jumlah kolom : ");
            int colB = scn.nextInt();
            matrikA = new double[rowA][colA];
            matrikB = new double[rowB][colB];

            if (opsi == 1 || opsi == 2) {
                if (rowA == rowB && colA == colB) 
                    break;
                else 
                    System.out.printf("\nOrdo pada matrik A dan B harus sama untuk melakukan operasi %s!\n", options[opsi-1]);
            }  
            else if (opsi == 3) {
                if (colA == rowB)
                    break;
                else
                    System.out.printf("\nJumlah kolom pada matrik A harus sama dengan jumlah baris matrik B untuk melakukan operasi %s!\n", options[opsi-1]);
            }
            else if (opsi == 4) {
                if (colA != rowB)
                    System.out.printf("\nJumlah kolom pada matrik A harus sama dengan jumlah baris matrik B untuk melakukan operasi %s!\n", options[opsi-1]);
                else if (rowB != colB)
                    System.out.printf("\nJumlah baris dan kolom pada matrik B harus sama untuk melakukan operasi %s!\n", options[opsi-1]);
                else 
                    break;
            }
        }
    }

    private static void konfigurasiElemen(int opsi){
        while(true) {
            System.out.println("\nMasukkan Elemen Matrik A :");
            for (int i = 0; i < matrikA.length; i++) {
                for (int j = 0; j < matrikA[0].length; j++) {
                    Scanner scn = new Scanner(System.in);
                    System.out.printf("Masukkan elemen %s : ", "A"+(i+1)+(j+1));
                    matrikA[i][j] = scn.nextDouble();
                }
            }
            System.out.println("\nMasukkan Elemen Matrik B :");
            for (int i = 0; i < matrikB.length; i++) {
                for (int j = 0; j < matrikB[0].length; j++) {
                    Scanner scn = new Scanner(System.in);
                    System.out.printf("Masukkan elemen %s : ", "B"+(i+1)+(j+1));
                    matrikB[i][j] = scn.nextDouble();
                }
            }
            if (opsi == 4) {
                double det = getDeterminan(matrikB, matrikB.length);
                if (det == 0)
                    System.out.printf("\nDeterminan pada matrik B harus tidak sama dengan nol untuk melakukan operasi %s! (Determinan matrik B: %s)\n", options[opsi - 1], elementF(det));
                else 
                    break;
            } else 
                break;
        }
    }

    private static void penjumlahan(double[][] matA, double[][] matB) {
        matrikC = new double[matA.length][matA[0].length];

        for (int i = 0; i < matA.length; i++)
            for (int j = 0; j < matA[0].length; j++) 
                matrikC[i][j] = matA[i][j] + matB[i][j];
    }

    private static void pengurangan(double[][] matA, double[][] matB) {
        matrikC = new double[matA.length][matA[0].length];
        
        for (int i = 0; i < matA.length; i++)
            for (int j = 0; j < matA[0].length; j++) 
                matrikC[i][j] = matA[i][j] - matB[i][j];
    }

    private static void perkalian(double[][] matA, double[][] matB) {
        matrikC = new double[matA.length][matB[0].length];

        for (int i = 0; i < matA.length; i++) 
            for (int j = 0; j < matB[0].length; j++)
                for (int k = 0; k < matB.length; k++)
                    matrikC[i][j] += matA[i][k] * matB[k][j];
    }

    private static void pembagian(double[][] matA, double[][] matB) {
        double[][] temp = new double[matB.length][matB[0].length];
        for (int i = 0; i < temp.length; i++) 
            for (int j = 0; j < temp[0].length; j++) 
                temp[i][j] = matB[i][j];

        perkalian(matA, getInverse(temp));
    }

    private static double getDeterminan(double mat[][], int n) {
        int D = 0; 
        if (n == 1)
            return mat[0][0];
        double temp[][] = new double[matrikB.length][matrikB.length];
        int sign = 1;
        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f] * getDeterminan(temp, n - 1);
            sign = -sign;
        }
 
        return D;
    }

    private static void getCofactor(double matrik[][], double temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = matrik[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static double[][] getInverse(double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i)
            b[i][i] = 1;
        gauss(a, index);
        for (int i = 0; i < n - 1; ++i)
            for (int j = i + 1; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    b[index[j]][k] -= a[index[j]][i] * b[index[i]][k];
        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

    public static void gauss(double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];
        for (int i = 0; i < n; ++i)
            index[i] = i;
        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1)
                    c1 = c0;
            }
            c[i] = c1;
        }
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];
                a[index[i]][j] = pj;
                for (int l = j + 1; l < n; ++l)
                    a[index[i]][l] -= pj * a[index[j]][l];
            }
        }
    }

    private static void printMatriks(int opsi) {
        System.out.printf("\n\nHasil Operasi %s Matrik :\nA %s B = C\n", options[opsi-1], operator);
        int[][] spc = setSpc(new double[][][] {matrikA, matrikB, matrikC});
        int spcA = spc[0][0];
        int spcB = spc[1][0];
        int spcC = spc[2][0];
        int spcO = operator.length();
        int colA = spc[0][1];
        int colB = spc[1][1];
        int colC = spc[2][1];
        int column = matrikA.length > matrikB.length ? matrikA.length : matrikB.length;
        
        for (int i = 0; i < column; i++) {
            int gap = column/2;
            int rowA = matrikA.length == column ? 0 : gap - matrikA.length/2;
            int rowB = matrikB.length == column ? 0 : gap - matrikB.length/2;
            int rowC = matrikC.length == column ? 0 : gap - matrikC.length/2;
            
            if (((i - rowA) < matrikA.length && (i - rowA) >= 0)) {
                System.out.print("|");
                for (int j = 0; j < matrikA[i - rowA].length; j++) {
                    if (j == 0)
                        System.out.printf("%" + colA + "s", elementF(matrikA[i - rowA][j]));
                    else
                        System.out.printf("%" + spcA + "s", elementF(matrikA[i - rowA][j]));
                }
                System.out.print("|");
            } else {
                System.out.print((" ").repeat(2+(spcA-1)+(matrikA[0].length-1)*spcA));
            }
            System.out.printf(" %s ", i == gap ? operator : " ".repeat(spcO));
            if ((i - rowB) < matrikB.length && (i - rowB) >= 0) {
                System.out.print("|");
                for (int j = 0; j < matrikB[i - rowB].length; j++) {
                    if (j == 0)
                        System.out.printf("%" + colB + "s", elementF(matrikB[i - rowB][j]));
                    else
                        System.out.printf("%" + spcB + "s", elementF(matrikB[i - rowB][j]));
                }
                System.out.print("|");
            } else {
                System.out.print((" ").repeat(2+(spcB-1)+(matrikB[0].length-1)*spcB));
            }
            System.out.printf(" %s ", i == gap ? "=" : " ");
            if ((i - rowC) < matrikC.length && (i - rowC) >= 0) {
                System.out.print("|");
                for (int j = 0; j < matrikC[i - rowC].length; j++) {
                    if (j == 0)
                        System.out.printf("%" + colC + "s", elementF(matrikC[i - rowC][j]));
                    else
                        System.out.printf("%" + spcC + "s", elementF(matrikC[i - rowC][j]));
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }

    private static int[][] setSpc(double[][][] matrik) {
        int[][] spc = new int[matrik.length][2];

        for (int i = 0; i < matrik.length; i++)
            for (double j[] : matrik[i]) {
                if (elementF(j[0]).length() > spc[i][1])
                    spc[i][1] = elementF(j[0]).length();
                for (double k : j) {
                    if (elementF(k).length() + 1 > spc[i][0])
                        spc[i][0] = elementF(k).length() + 1;
                }
            }
        return spc;
    }

    private static String elementF(double value) {
        return value - (long)value == 0 ? String.valueOf((long)(value)) : String.valueOf(value);
    }
}
