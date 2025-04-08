import java.util.Scanner;

public class StringCaseConversionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Convert string to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert string to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        scanner.close();
    }
}
