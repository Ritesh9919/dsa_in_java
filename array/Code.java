
package array;

import java.util.*;

public class Code {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number at index: " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        // 1.
        // int[] arr = new int[5];

        // 2.
        // int[] arr2 = { 1, 2, 3, 4, 5 };

        // System.out.println(arr2[0]);
        // for (int i = 0; i < arr2.length; i++) {
        // System.out.println(arr2[i] + " ");
        // }
        int[] arr = takeInput();
        System.out.println(Arrays.toString(arr));

    }
}
