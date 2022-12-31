public class QuickSort {
    private void partisi(int data[], int indba, int inda) {
        /*
         * indba adalah index bawah dan inda adalah index atas
         * dari data yang akan di urutkan
         */
        int i = indba, j = inda, temp;
        int pivot = data[indba];
        System.out.printf("\nDeklarasi dan Inisialisasi variabel i = %s, j = %s, pivot = %s", i, j, pivot);
        
        // pembagian partisi
        System.out.printf("\nProses Pembagian Partisi\nLakukan perulangan selama i <= j (%s <= %s)", i, j);
        do {
            System.out.printf("\nLakukan perulangan selama data[%s] < pivot (%s < %s)", i, data[i], pivot);
            System.out.printf("\nSebelum : data[%s] = %s, pivot = %s", i, data[i], pivot);
            while (data[i] < pivot)
                i++;
            System.out.printf("\nSetelah : data[%s] = %s, pivot = %s", i, data[i], pivot);
            System.out.printf("\nLakukan perulangan selama data[%s] > pivot (%s > %s)", j, data[j], pivot);
            System.out.printf("\nSebelum : data[%s] = %s, pivot = %s", j, data[j], pivot);
            while (data[j] > pivot)
                j--;
            System.out.printf("\nSetelah : data[%s] = %s, pivot = %s", j, data[j], pivot);
            if (i <= j) {
                System.out.printf("\nJika i <= j (%s <= %s) bernilai true, maka tukar data[%s] dengan data[%s]", i, j, i, j);
                System.out.printf("\nSebelum : data[%s] = %s, data[%s] = %s", i, data[i], j, data[j]);
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;// tukar
                System.out.printf("\nSetelah : data[%s] = %s, data[%s] = %s", i, data[i], j, data[j]);
                System.out.printf("\nIncrement variabel i  dan Decrement variabel j");
                System.out.printf("\nSebelum : i = %s, j = %s", i, j);
                i++;
                j--;
                System.out.printf("\nSetelah : i = %s, j = %s", i, j);
            }
        } while (i <= j);

        // pengurutan
        System.out.println("\nProses Pengurutan Partisi");
        if (indba < j) {
            System.out.printf("\nJika indba < j (%s < %s) bernilai true, maka lakukan recursion method partisi dengan parameter (%s, %s, %s)", indba, j, "data", indba, j);
            partisi(data, indba, j);
        }
        if (i < inda) {
            System.out.printf("\nJika i > inda (%s > %s) bernilai true, maka lakukan recursion method partisi dengan parameter (%s, %s, %s)", i, inda, "data", i, inda);
            partisi(data, i, inda);
        }
    }

    public static void main(String[] args) {
        int tabInt[] = { 9, 4, 2, 7, 10, 1, 5 };
        int i, n = 7;
        QuickSort sekat = new QuickSort();
        System.out.print("data sebelum di urutkan\n");
        for (i = 0; i < n; i++)
            System.out.print(tabInt[i] + " ");
        System.out.print("\n");
        sekat.partisi(tabInt, 0, n - 1);
        System.out.print("\nsetelah di urutkan dengan quick sort\n");
        for (i = 0; i < n; i++)
            System.out.print(tabInt[i] + " ");
    }
}