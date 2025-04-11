package ControlStructures;

// Program to categorize age group using if-else-if ladder
public class IfElseIfExample {
    public static void main(String[] args) {
        int age = 25;

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Output:
        // You are an adult.
    }
}
