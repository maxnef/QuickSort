/**
 * Basic integer quick sort algorithm class
 * code taken from https://www.javatpoint.com/quick-sort
 * @author Efe Kaan Karakaya <efekaan.karakaya@outlook.com>
 * @since 11/07/2022
 */
public class IntegerQuickSort<Integer> {
    private int[] arr;

    /**
     * default constructor
     * @param arr integer array to be sorted
     * @throws Exception in case of empty array
     */
    public IntegerQuickSort(int[] arr) throws Exception {
        if(arr.length == 0) {
            throw new Exception("Array should not be empty.");
        }
        this.arr = arr;
    }

    /**
     * public method to get sorted array, it won't change original one
     * @return integer sorted array
     */
    public int[] getSortedArray() {
        int[] arrCopy = this.arr.clone();
        return sort(arrCopy, 0, this.arr.length - 1);
    }

    /**
     * public method to get unsorted(the one sent to constructor) array
     * @return integer unsorted array
     */
    public int[] getUnsortedArray() {
        return this.arr;
    }

    /**
     * public setter to change array
     * @param arr integer new array
     */
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    /**
     * private recursive array to sort continuously considering sub-arrays
     * @param arr integer array or sub-array to be sorted
     * @param left integer start index of the given array
     * @param right integer end index of the given array
     * @return integer sorted array
     */
    private int[] sort(int[] arr, int left, int right) {
        if(left < right) {
            int pivotIndex = partition(arr, left, right);
            sort(arr, left, pivotIndex - 1);
            sort(arr, pivotIndex + 1, right);
        }
        return arr;
    }

    /**
     * private method to sort given array by looking from left to right (excl. pivot)
     * @param arr integer given array
     * @param left integer most-left index of the given array
     * @param right integer most-right index of the given array
     * @return integer sorted array
     */
    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        for(int i = left; i <= right - 1; i++) {
            if(arr[i] < pivot) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return left;
    }
}
