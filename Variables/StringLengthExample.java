public class StringLengthExample {
    public static void main(String[] args) {
        // Example strings
        String str1 = "Java Programming";
        String str2 = "Hello, World!";
        String str3 = " ";
        String str4 = "";

        // Get and print the length of each string
        System.out.println("Length of str1: " + str1.length());  // 16
        System.out.println("Length of str2: " + str2.length());  // 13
        System.out.println("Length of str3: " + str3.length());  // 1 (space is a character)
        System.out.println("Length of str4: " + str4.length());  // 0 (empty string)
    }
}
