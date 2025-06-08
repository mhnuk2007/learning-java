package string;

public class DoubledLetterRemover {

    // Method to remove doubled letters
    public static String removeDoubledLetters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            // If it's the first character or different from the previous one, append it
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(removeDoubledLetters("tresidder"));   // Output: "tresider"
        System.out.println(removeDoubledLetters("bookkeeper"));  // Output: "bokeper"
    }
}
