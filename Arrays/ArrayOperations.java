package Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(get(arr, 2));
        set(arr, 2, 9);
        System.out.println(get(arr, 2));
    }
        // Get element - O(1)
    public static int get(int[] arr, int index){
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds:"  + index);
        }
        return arr[index];
    }

    // Set element - O(1)
    public static void set(int[] arr, int index, int value){
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds:"  + index);
        }
        arr[index] = value;
    }
}
