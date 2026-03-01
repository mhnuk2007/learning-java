package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("enter a string: ");
            strArr[i] = sc.next();
        }

        System.out.println(Arrays.toString(strArr));
    }
}
