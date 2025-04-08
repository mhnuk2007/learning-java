public class StringContainsExample {
    public static void main(String[] args) {
        String mainString = "Learning Java is fun and powerful!";
        String keyword1 = "Java";
        String keyword2 = "Python";

        // Check if mainString contains keyword1
        if (mainString.contains(keyword1)) {
            System.out.println("The string contains \"" + keyword1 + "\".");
        } else {
            System.out.println("The string does not contain \"" + keyword1 + "\".");
        }

        // Check if mainString contains keyword2
        if (mainString.contains(keyword2)) {
            System.out.println("The string contains \"" + keyword2 + "\".");
        } else {
            System.out.println("The string does not contain \"" + keyword2 + "\".");
        }
    }
}
