public class StringCaseConversionExample {
    public static void main(String[] args) {
        String original = "Java Programming Is Fun!";

        // Convert to lowercase
        String lower = original.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Convert to uppercase
        String upper = original.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Capitalize each word manually
        String[] words = original.toLowerCase().split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
            }
        }

        System.out.println("Capitalized Words: " + capitalized.toString().trim());
    }
}
