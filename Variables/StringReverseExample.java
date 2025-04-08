import java.util.Scanner;

public class StringReverseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from user
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
