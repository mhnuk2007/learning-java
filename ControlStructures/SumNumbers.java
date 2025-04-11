package ControlStructures;

import java.util.Scanner;
// Sum of Numbers from 1 to N
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
    }
}
