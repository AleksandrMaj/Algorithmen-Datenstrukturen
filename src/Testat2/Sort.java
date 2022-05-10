package Testat2;

/**
 * This class encompasses different algorithms to sort arrays of integers
 * @author Aleks
 */

public class Sort {
    /**
     * The insertionSort algorithm
     * @param data The array that should be sorted
     * @return The sorted array
     */
    public static int[] insertionSort(int[] data) {
        int elem;
        for (int i = 1; i < data.length; i++) {
            elem = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > elem) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = elem;
        }
        return data;
    }

    /**
     * The selectionSort algorithm
     * @param data The array that should be sorted
     * @return The sorted array
     */
    public static int[] selectionSort(int[] data) {
        for (int left = 0; left < data.length - 1; left++) {
            for (int right = left + 1; right < data.length; right++) {
                if (data[left] > data[right]) {
                    int temp = data[left];
                    data[left] = data[right];
                    data[right] = temp;
                }
            }
        }
        return data;
    }

    /**
     * The bubbleSort algorithm
     * @param data The array that should be sorted
     * @return The sorted array
     */
    public static int[] bubbleSort(int[] data) {
        int k;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                k = data[i];
                data[i] = data[i + 1];
                data[i + 1] = k;
                bubbleSort(data);
            }
        }
        return data;
    }

    /**
     * The mergeSort algorithm
     * @param data The array that should be sorted
     * @return The sorted array
     */
    public static int[] mergeSort(int[] data) {
        int n = data.length;
        if (n < 2) {
            return data;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = data[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = data[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(data, left, right, mid, n - mid);
        return data;
    }

    /**
     * The merge method for the mergeSort algorithm to combine the two different arrays
     * @param data The unsorted array
     * @param leftData The left part of the array
     * @param rightData The right part of the array
     * @param left The first index
     * @param right the last index
     */
    private static void merge(int[] data, int[] leftData, int[] rightData, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftData[i] <= rightData[j]) {
                data[k++] = leftData[i++];
            } else {
                data[k++] = rightData[j++];
            }
        }
        while (i < left) {
            data[k++] = leftData[i++];
        }
        while (j < right) {
            data[k++] = rightData[j++];
        }
    }

    /**
     * The quickSort algorithm
     * @param data The unsorted array
     * @param low The first index of the array
     * @param high The last index of the array
     * @return The sorted array
     */
    public static int[] quickSort(int[] data, int low, int high) {
        int i = low, j = high;
        int pivot = data[low + (high - low) / 2];

        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }

            while (data[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(data, low, j);
        if (i < high)
            quickSort(data, i, high);
        return data;
    }
}
