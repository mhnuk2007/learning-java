public class StringCompareExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "java";

        // 1. Using equals() – case-sensitive comparison
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // 2. Using equalsIgnoreCase() – case-insensitive comparison
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // 3. Using compareTo() – case-sensitive lexicographic comparison
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative

        // 4. Using == – reference comparison
        System.out.println("str1 == str2: " + (str1 == str2)); // true (same literal pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
    }
}
