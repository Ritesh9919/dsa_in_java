package recursion;

public class Questions {

    public static int nthFib(int n) {
        if (n < 2) {
            return n;
        }
        return nthFib(n - 1) + nthFib(n - 2);
    }

    public static int binarySearchRec(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearchRec(arr, target, start, mid - 1);
        }
        return binarySearchRec(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        // int ans = nthFib(4);
        // System.out.println(ans);
        int[] arr = { 1, 2, 3, 4, 5 };
        int ans = binarySearchRec(arr, 2, 0, arr.length - 1);
        System.out.println(ans);
    }
}
