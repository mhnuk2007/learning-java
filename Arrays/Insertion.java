package Arrays;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        arr = insertAtEnd(arr, 8);
        System.out.println("After insertion at end: " + Arrays.toString(arr));

        arr = insertAtBeginning(arr, 10);
        System.out.println("After insertion at beginning: " + Arrays.toString(arr));

        arr = insertAtPosition(arr, 2, 99);
        System.out.println("After insertion at position 2: " + Arrays.toString(arr));
    }

    // Insert at end - O(n) (because new array is created)
    public static int[] insertAtEnd(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
        return newArr;
    }

    // Insert at beginning - O(n)
    public static int[] insertAtBeginning(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    }

    // Insert at position - O(n)
    public static int[] insertAtPosition(int[] arr, int index, int value) {

        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }

        int[] newArr = new int[arr.length + 1];
        System.out.println(Arrays.toString(newArr));

        System.arraycopy(arr, 0, newArr, 0, index);
        System.out.println(Arrays.toString(newArr));
        newArr[index] = value;
        System.out.println(Arrays.toString(newArr));
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        System.out.println(Arrays.toString(newArr));

        return newArr;
    }
}