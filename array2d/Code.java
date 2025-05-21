package array2d;

import java.util.Scanner;

public class Code {

    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of col");
        int col = sc.nextInt();

        int[][] arr2d = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        return arr2d;
    }

    public static void main(String[] args) {
        // int[][] arr2d = new int[3][3];
        // int[][] arr2d2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2d = takeInput();
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

    }
}
