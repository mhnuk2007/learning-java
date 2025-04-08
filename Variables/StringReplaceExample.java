public class StringReplaceExample {
    public static void main(String[] args) {
        String originalString = "Hello, Java World! Java is fun.";

        // 1. Replace all occurrences of "Java" with "Python"
        String replacedString1 = originalString.replace("Java", "Python");
        System.out.println("Replaced 'Java' with 'Python': " + replacedString1);

        // 2. Replace first occurrence of "Java" with "Python"
        String replacedString2 = originalString.replaceFirst("Java", "Python");
        System.out.println("Replaced first 'Java' with 'Python': " + replacedString2);

        // 3. Replace all occurrences of space with an underscore
        String replacedString3 = originalString.replace(" ", "_");
        System.out.println("Replaced spaces with underscores: " + replacedString3);

        // 4. Replace a character with another character
        String replacedString4 = originalString.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedString4);
    }
}
