package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 15};

        int result = linearSearch(arr, 14);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;

    }
}
