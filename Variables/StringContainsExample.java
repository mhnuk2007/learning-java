import java.util.Scanner;

public class StringContainsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string and substring from user
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        System.out.println("Enter the substring to search:");
        String substring = scanner.nextLine();

        // Check if the string contains the substring
        if (str.contains(substring)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }

        scanner.close();
    }
}
