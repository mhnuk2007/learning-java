public class StringTrimExample {
    public static void main(String[] args) {
        // String with leading and trailing spaces
        String originalString = "   Java Programming is fun!   ";

        // Trim the spaces from the beginning and end of the string
        String trimmedString = originalString.trim();

        // Output the original and trimmed strings
        System.out.println("Original String: '" + originalString + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
