import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Calculate and display the length of the string
        int length = input.length();
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}
