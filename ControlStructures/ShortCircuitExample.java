package ControlStructures;

public class ShortCircuitExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // AND operator (&&)
        if (a > 3 && b < 15) {
            System.out.println("Both conditions are true (AND).");
        }

        // OR operator (||)
        if (a < 3 || b > 5) {
            System.out.println("At least one condition is true (OR).");
        }

        // Short-circuit in AND (left condition is false, right one isn't evaluated)
        if (a < 3 && (b / 0) == 0) {  // Division by zero is prevented
            System.out.println("This won't be printed due to short-circuiting.");
        }

        // Short-circuit in OR (left condition is true, right one isn't evaluated)
        if (a > 3 || (b / 0) == 0) {  // No division by zero occurs
            System.out.println("This will be printed due to short-circuiting.");
        }
    }
}
