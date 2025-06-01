package string;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Convert to lowercase to make the check case-insensitive
        word = word.toLowerCase();

        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        input.close();
    }
        public static boolean isPalindrome (String word){

            // Reverse the string
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);

            }
            // Check if the word is equal to its reverse
            if (word.equals(reversed)) {
                return true;
            } else {
                return false;
            }

        }



    }

