import java.util.Scanner;

public class StringStartEndExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string and substring from user
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        System.out.println("Enter the substring to check at the start:");
        String startSubstring = scanner.nextLine();

        System.out.println("Enter the substring to check at the end:");
        String endSubstring = scanner.nextLine();

        // Check if string starts and ends with the specified substrings
        if (str.startsWith(startSubstring)) {
            System.out.println("The string starts with the given substring.");
        } else {
            System.out.println("The string does not start with the given substring.");
        }

        if (str.endsWith(endSubstring)) {
            System.out.println("The string ends with the given substring.");
        } else {
            System.out.println("The string does not end with the given substring.");
        }

        scanner.close();
    }
}
