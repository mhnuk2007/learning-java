package ControlStructures;

import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int count = 0;
        int i = 1;

        while (i <= N) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }

        System.out.println("Number of even numbers from 1 to " + N + ": " + count);
    }
}
