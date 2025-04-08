import java.util.Scanner;

public class StringConcatenationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input strings from user
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Concatenate the strings
        String result = str1 + " " + str2;
        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}
