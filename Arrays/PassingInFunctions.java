package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 17};
        System.out.println(Arrays.toString(arr));

        changeVal(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void changeVal(int[] arr) {
        arr[0] = 99;
    }
}
