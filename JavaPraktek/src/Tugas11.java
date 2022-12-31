import java.util.Scanner;

class Anisa_matriks {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        char ulang;

        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("                  DAFTAR KALKULATOR MATRIKS                 ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. SELESAI");
            System.out.println();

            System.out.print("Pilih jenis kelkulator 1/2/3/4 : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("                      PENJUMLAHAN MATRIKS                   ");
                    System.out.println("------------------------------------------------------------");
                    int n, c, s, a;
                    int matriks1[][] = new int[10][10];
                    int matriks2[][] = new int[10][10];
                    int hasil[][] = new int[10][10];
                    Scanner scn = new Scanner(System.in);

                    System.out.print("Masukkan jumlah baris matriks: ");
                    s = scn.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    a = scn.nextInt();

                    System.out.println("Masukkan elemen matriks A: ");
                    for (n = 0; n < s; n++) {
                        for (c = 0; c < a; c++) {
                            matriks1[n][c] = scn.nextInt();
                        }
                    }

                    System.out.println("Masukkan elemen matriks B: ");
                    for (n = 0; n < s; n++) {
                        for (c = 0; c < a; c++) {
                            matriks2[n][c] = scn.nextInt();
                        }
                    }

                    System.out.println("Hasil penjumlahan matriks A + B: ");
                    for (n = 0; n < s; n++) {
                        for (c = 0; c < a; c++) {
                            hasil[n][c] = matriks1[n][c] + matriks2[n][c];
                            System.out.print(hasil[n][c] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("                      PENGURANGAN MATRIKS                   ");
                    System.out.println("------------------------------------------------------------");
                    int z, u, k, o;
                    int matriksk[][] = new int[10][10];
                    int matrikso[][] = new int[10][10];
                    int hsil[][] = new int[10][10];
                    Scanner scan = new Scanner(System.in);

                    System.out.print("Masukkan jumlah baris matriks: ");
                    k = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    o = scan.nextInt();

                    System.out.println("Masukkan elemen matriks A: ");
                    for (z = 0; z < k; z++) {
                        for (u = 0; u < o; u++) {
                            matriksk[z][u] = scan.nextInt();
                        }
                    }
                    System.out.println("Masukkan elemen matriks B: ");
                    for (z = 0; z < k; z++) {
                        for (u = 0; u < o; u++) {
                            matrikso[z][u] = scan.nextInt();
                        }
                    }

                    System.out.println("Hasil pengurangan A-B: ");
                    for (z = 0; z < k; z++) {
                        for (u = 0; u < o; u++) {
                            hsil[z][u] = matriksk[z][u] - matrikso[z][u];
                            System.out.print(hsil[z][u] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("                       PERKALIAN MATRIKS                    ");
                    System.out.println("------------------------------------------------------------");
                    int x, y, b, r, d, t, e, jumlah = 0;
                    int matriksr[][] = new int[10][10];
                    int matriksd[][] = new int[10][10];
                    int hsl[][] = new int[10][10];
                    Scanner sc = new Scanner(System.in);

                    System.out.print("Masukkan jumlah baris matriks A: ");
                    r = sc.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks A: ");
                    d = sc.nextInt();

                    System.out.print("Masukkan jumlah baris matriks B: ");
                    t = sc.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks B: ");
                    e = sc.nextInt();

                    if (d != t) {
                        System.out.println("Matriks tidak dapat dikalikan satu sama lain.\n");
                    } else {
                        System.out.println("Masukkan elemen matriks A: ");
                        for (x = 0; x < d; x++) {
                            for (y = 0; y < d; y++) {
                                matriksr[x][y] = sc.nextInt();
                            }
                        }

                        System.out.println("Masukkan elemen matriks B: ");
                        for (x = 0; x < t; x++) {
                            for (y = 0; y < e; y++) {
                                matriksd[x][y] = sc.nextInt();
                            }
                        }

                        for (x = 0; x < d; x++) {
                            for (y = 0; y < e; y++) {
                                for (b = 0; b < t; b++) {
                                    jumlah = jumlah + matriksr[x][b] * matriksd[b][y];
                                }
                                hsl[x][y] = jumlah;
                                jumlah = 0;
                            }
                        }

                        System.out.println("Hasil perkalian matriks A x B: ");
                        for (x = 0; x < r; x++) {
                            for (y = 0; y < d; y++) {
                                System.out.print(hsl[x][y] + "\t");
                            }
                            System.out.println();
                        }
                    }

                    break;
                case 4:
                    System.out.println("                       PEMBAGIAN MATRIKS                    ");
                    System.out.println("------------------------------------------------------------");
                    Scanner seken = new Scanner(System.in);
                    System.out.println("Masukkan jumlah baris dan kolom dari matriks A:");
                    int baris1 = seken.nextInt();
                    int kolom1 = seken.nextInt();

                    int[][] matrix1 = new int[baris1][kolom1];
                    System.out.println("Masukkan elemen matriks A:");
                    for (int i = 0; i < baris1; i++) {
                        for (int j = 0; j < kolom1; j++) {
                            matrix1[i][j] = seken.nextInt();
                        }
                    }

                    System.out.println("Masukkan jumlah baris dan kolom dari matriks B:");
                    int baris2 = seken.nextInt();
                    int kolom2 = seken.nextInt();

                    int[][] matrix2 = new int[baris2][kolom2];
                    System.out.println("Masukkan elemen matriks B:");
                    for (int i = 0; i < baris2; i++) {
                        for (int j = 0; j < kolom2; j++) {
                            matrix2[i][j] = seken.nextInt();
                        }
                    }

                    if (baris1 != kolom2) {
                        System.out.println("Matriks tidak dapat dibagi.");
                        return;
                    }
                    int[][] quotient = new int[kolom1][baris2];
                    for (int i = 0; i < kolom1; i++) {
                        for (int j = 0; j < baris2; j++) {
                            quotient[i][j] = matrix1[i][j] / matrix2[i][j];
                        }
                    }

                    System.out.println("Hasil bagi dari matriks:");
                    for (int i = 0; i < kolom1; i++) {
                        for (int j = 0; j < baris2; j++) {
                            System.out.print(quotient[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("SELESAI");
                    break;
                default:
                    System.out.println("maaf, tidak ada dalam daftar");
            }

            System.out.println();

            System.out.print("Ingin memilih menu lain (y/t)? ");
            ulang = input.next().charAt(0);

            System.out.println();
        } while (ulang != 't');
        System.out.println("------------------------------------------------------------");
        System.out.println("                       --TERIMAKASIH--                      ");
        System.out.println("------------------------------------------------------------");

    }
}