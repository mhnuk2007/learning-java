import java.util.Scanner;

public class StringCompareExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two input strings from user
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Compare the strings
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}
