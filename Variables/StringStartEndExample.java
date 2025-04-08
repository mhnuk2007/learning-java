public class StringStartEndExample {
    public static void main(String[] args) {
        String originalString = "Java Programming";

        // Check if the string starts with "Java"
        if (originalString.startsWith("Java")) {
            System.out.println("The string starts with 'Java'.");
        } else {
            System.out.println("The string does not start with 'Java'.");
        }

        // Check if the string ends with "Programming"
        if (originalString.endsWith("Programming")) {
            System.out.println("The string ends with 'Programming'.");
        } else {
            System.out.println("The string does not end with 'Programming'.");
        }
        
        // Check with another string
        String anotherString = "Hello, World!";
        if (anotherString.startsWith("Hello")) {
            System.out.println("The string starts with 'Hello'.");
        }

        if (anotherString.endsWith("World!")) {
            System.out.println("The string ends with 'World!'.");
        }
    }
}
