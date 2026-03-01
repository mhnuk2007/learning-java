package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] arr = new int[3][3];

        int[][] arr =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        System.out.println(Arrays.deepToString(arr));
    }
}
