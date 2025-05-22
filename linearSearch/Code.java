package linearSearch;

public class Code {
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 9, 3 };
        int target = 9;
        int index = linearSearch(arr, target);
        System.out.println(index);
    }
}