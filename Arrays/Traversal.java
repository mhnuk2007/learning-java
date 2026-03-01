package Arrays;

import java.util.Arrays;

public class Traversal {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 4, 9, 8, 10, 1};
        traverse1(arr);
        traverse2(arr);
        traverse3(arr);
        traverse4(arr);
        traverse5(arr);
    }

    // Traditional for loop
    public static void  traverse1(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // Enhanced for loop (for-each)
    public static void  traverse2(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        for(int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Using Arrays.toString
    public static void traverse3(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        System.out.println(Arrays.toString(arr));
    }

    // Using streams
    public static void traverse4(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    // Using steams + method-reference
    public static void traverse5(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        }
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
    }
    }
