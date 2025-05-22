package linearSearch;

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

    public static void main(String[] args) {
        String str = "ritesh";
        char target = 's';
        System.out.println(searchInString(str, target));
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(searchInRange(arr, 5, 2, 5));
    }
}
