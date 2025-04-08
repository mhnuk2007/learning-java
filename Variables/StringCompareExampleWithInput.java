import java.util.Scanner;

public class StringCompareExampleWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // 1. Using equals()
        System.out.println("Using equals(): " + str1.equals(str2));

        // 2. Using equalsIgnoreCase()
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

        // 3. Using compareTo()
        int result = str1.compareTo(str2);
        System.out.println("Using compareTo(): " + result +
            (result == 0 ? " (Equal)" : result < 0 ? " (str1 < str2)" : " (str1 > str2)"));

        // 4. Using ==
        System.out.println("Using == : " + (str1 == str2 ? "Same reference" : "Different references"));

        scanner.close();
    }
}
