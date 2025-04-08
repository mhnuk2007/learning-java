import java.util.Scanner;

public class StringTrimExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.println("Enter a string with spaces:");
        String str = scanner.nextLine();

        // Trim whitespace
        String trimmed = str.trim();
        System.out.println("Trimmed string: " + trimmed);

        scanner.close();
    }
}
