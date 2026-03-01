package Arrays;

import java.util.Arrays;

public class Update {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        updateAll(arr, 3);
        System.out.println("After updating all elements: " + Arrays.toString(arr));
        updateIf(arr, 9, 88);
        System.out.println("After updating conditionally: " + Arrays.toString(arr));


    }
    // Update All(in place)
    public static void updateAll(int[] arr, int multiplier){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * multiplier;
        }
    }

    // Update with condition
    public static void updateIf(int[] arr, int threshold, int newValue){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == threshold){
                arr[i] = newValue;
            }
        }
    }

    }
