public class StringConcatenationExample {
    public static void main(String[] args) {
        String firstName = "Mohan";
        String lastName = "Lal";

        // 1. Using + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("Using + operator: " + fullName1);

        // 2. Using concat() method
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat(): " + fullName2);

        // 3. Using StringBuilder (efficient in loops)
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        System.out.println("Using StringBuilder: " + sb.toString());

        // 4. Using String.format()
        String fullName4 = String.format("%s %s", firstName, lastName);
        System.out.println("Using String.format(): " + fullName4);
    }
}
