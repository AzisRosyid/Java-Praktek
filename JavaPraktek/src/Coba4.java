import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Coba4 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 3, 4, 9, 7, 8, 2, 5, 6));
        Collections.sort(list);
        printAll(list);
        print(list.set(2, 5));
        printAll(list);

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 3, 4, 9, 7, 8, 2, 5, 6));;
        Collections.sort(array);
        printAll(array);
        print(array.set(2, 5));
        printAll(array);
    }

    private static void process() {

    }

    private static void printAll(LinkedList<Integer> list) {
        for (int i: list) System.out.print(i + " ");
        System.out.println();
    }

    private static void printAll(ArrayList<Integer> list) {
        for (int i: list) System.out.print(i + " ");
        System.out.println();
    }

    private static void print(int value) {
        System.out.println(value);
    }
}
