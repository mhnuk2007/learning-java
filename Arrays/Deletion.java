package Arrays;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("Original Array: " + Arrays.toString(arr));
        arr = deleteAtEnd(arr);
        System.out.println("After deletion at end: " + Arrays.toString(arr));
        arr = deleteAtBeginning(arr);
        System.out.println("After deletion at beginning: " + Arrays.toString(arr));
        arr = deleteAtPosition(arr, 4);
        System.out.println("After deletion at position 4: " + Arrays.toString(arr));

    }// Delete at end - O(1)
    public static int[] deleteAtEnd(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length-1);
        return newArr;
    }

    // Delete at beginning - O(n)
    public static int[] deleteAtBeginning(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
        return newArr;
    }

    // Delete at position - O(n)
    public static int[] deleteAtPosition(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + arr.length);
        }
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index+1, newArr, index, arr.length-index-1);
        return newArr;

    }

}
