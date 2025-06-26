package recursion;

public class Code {

    public static void print1() {
        System.out.println("Hello World");
        print2();
    }

    public static void print2() {
        System.out.println("Hello World");
        print3();
    }

    public static void print3() {
        System.out.println("Hello World");
        print4();
    }

    public static void print4() {
        System.out.println("Hello World");
        print5();
    }

    public static void print5() {
        System.out.println("Hello World");

    }

    public static void printNum1(int n) {
        System.out.println(n);
        printNum2(2);

    }

    public static void printNum2(int n) {
        System.out.println(n);
        printNum3(3);

    }

    public static void printNum3(int n) {
        System.out.println(n);
        printNum4(4);

    }

    public static void printNum4(int n) {
        System.out.println(n);
        printNum5(5);

    }

    public static void printNum5(int n) {
        System.out.println(n);

    }

    public static void recursion(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        recursion(n + 1);
    }

    public static void main(String[] args) {
        // this print hello world 5 times
        // print1();
        // this print 1 to 5
        // printNum1(1);
        recursion(1);
    }
}
