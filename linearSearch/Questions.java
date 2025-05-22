package linearSearch;

import java.util.Arrays;

public class Questions {

    public static boolean searchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    public static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] searchInArr2d(int[][] arr2d, int target) {

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static int maxValIn2dArray(int[][] arr2d) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (max < arr2d[i][j]) {
                    max = arr2d[i][j];
                }
            }
        }
        return max;
    }

    public static int minValIn2dArray(int[][] arr2d) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (min > arr2d[i][j]) {
                    min = arr2d[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // String str = "ritesh";
        // char target = 's';
        // System.out.println(searchInString(str, target));
        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(searchInRange(arr, 5, 2, 5));
        int[][] arr2d = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int target = 18;
        int[] result = searchInArr2d(arr2d, target);
        System.out.println(Arrays.toString(result));

    }
}
