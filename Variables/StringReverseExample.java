public class StringReverseExample {
    public static void main(String[] args) {
        String originalString = "Java Programming";

        // Using StringBuilder's reverse() method
        String reversedString = new StringBuilder(originalString).reverse().toString();

        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}

