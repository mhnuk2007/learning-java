package ControlStructures;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 7;  // Secret number
        int guess = 0;

        while (guess != target) {
            System.out.print("Guess the number (1-10): ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the right number.");
    }
}
