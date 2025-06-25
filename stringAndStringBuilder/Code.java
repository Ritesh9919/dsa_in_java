package stringAndStringBuilder;

public class Code {
    public static void main(String[] args) {
        // String name = "Ritesh Maurya";
        // System.out.println(name);

        // o(n2) time complexity because String is immutable and create many object
        // String series = "";
        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // series = series + ch;
        // }
        // System.out.println(series);

        // o(n) time complexity
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            str.append(ch);
        }
        System.out.println(str);

    }
}
