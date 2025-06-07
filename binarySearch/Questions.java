package binarySearch;

public class Questions {
    public static int ceillingOfNumbers(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int floorOfNumbers(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 11, 13 };
        int target = 10;
        System.out.println(ceillingOfNumbers(numbers, target));
        System.out.println(floorOfNumbers(numbers, target));
    }
}
