import java.util.Scanner;

public class StringReplaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string and characters from user
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        System.out.println("Enter the character to be replaced:");
        char oldChar = scanner.next().charAt(0);

        System.out.println("Enter the new character:");
        char newChar = scanner.next().charAt(0);

        // Replace character in the string
        String result = str.replace(oldChar, newChar);
        System.out.println("Modified string: " + result);

        scanner.close();
    }
}
