/**
 * Main class to prepare data and start design
 * @author Efe Kaan Karakaya <efekaan.karakaya@outlook.com>
 * @since 11/07/2022
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {46, 59, 75, 2, 26, 18, 6, 19, 50, 24};
        IntegerQuickSort<Integer> quickSort = new IntegerQuickSort<Integer>(arr);
        System.out.println(Arrays.toString(quickSort.getSortedArray()));
    }
}
