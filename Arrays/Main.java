package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rollNo = new int[5]; //declaration only, no initialization
        // or
        int[] rollNo2 = {2, 5, 9, 10, 22}; // declaration and initialization

        System.out.print("rollNo = {");
        int size = rollNo.length -1;
        for (int i = 0; i < size; i++) {
            if (i < size-1) {
                System.out.print(rollNo[i] + ", ");
            }  else {
                System.out.print(rollNo[i]);
            }
        }
        System.out.println("}");

        System.out.print("rollNo2 = {");
        int size2 = rollNo2.length -1;
        for (int i = 0; i < size; i++) {
            if (i < size-1) {
                System.out.print(rollNo2[i] + ", ");
            }  else {
                System.out.print(rollNo2[i]);
            }
        }
        System.out.println("}");
    }
}
