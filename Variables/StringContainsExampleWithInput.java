import java.util.Scanner;

public class StringContainsExampleWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input the substring to search for
        System.out.print("Enter the substring to check: ");
        String searchString = scanner.nextLine();

        // Check if main string contains the substring
        if (mainString.contains(searchString)) {
            System.out.println("Yes, the main string contains the substring.");
        } else {
            System.out.println("No, the main string does not contain the substring.");
        }

        scanner.close();
    }
}
