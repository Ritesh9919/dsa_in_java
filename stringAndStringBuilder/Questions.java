package stringAndStringBuilder;

public class Questions {

    public static Boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
}
