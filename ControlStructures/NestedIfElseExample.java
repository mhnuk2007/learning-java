package ControlStructures;

// Program to find the largest of three numbers using nested if-else
public class NestedIfElseExample {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 9;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest.");
            } else {
                System.out.println("c is the largest.");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest.");
            } else {
                System.out.println("c is the largest.");
            }
        }

        // Output:
        // b is the largest.
    }
}
