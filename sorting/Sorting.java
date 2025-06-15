package sorting;

import java.util.Arrays;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxEleIndex = getMax(arr, 0, lastIndex);
            int temp = arr[maxEleIndex];
            arr[maxEleIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 5, 2 };
        // bubbleSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
