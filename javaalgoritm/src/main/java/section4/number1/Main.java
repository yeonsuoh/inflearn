package section4.number1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        Integer[] arr1 = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();

        Integer[] arr2 = new Integer[m];

        for (int j = 0; j < m; j++) {
            arr2[j] = kb.nextInt();
        }

        ArrayList<Integer> mergedList = new ArrayList<Integer>(Arrays.asList(arr1));
        mergedList.addAll(Arrays.asList(arr2));
        mergedList.sort(Comparator.naturalOrder());

        for (int i = 0; i < mergedList.size(); i++) {
            System.out.print(mergedList.get(i) + " ");
        }
    }
}
