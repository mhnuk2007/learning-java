package Basics;

public class Strings {
    public static void main(String[] args) {
        String studentFirstName = "Honey";
        String studentLastName = "Chauhan";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        String favouriteQuote = "Do the best you can until you know better. Then when you know better, do better.";

        System.out.println("Student First Name: " + studentFirstName);
        System.out.println("Student Last Name: " + studentLastName);
        System.out.println("Student First Initial: " + studentFirstInitial);
        System.out.println("Student Last Initial: " + studentLastInitial);

        System.out.println(favouriteQuote.startsWith("do"));
        System.out.println(favouriteQuote.contains("better"));
        System.out.println(favouriteQuote.toCharArray());
        System.out.println(favouriteQuote.toUpperCase());
        System.out.println(favouriteQuote.toLowerCase());
        System.out.println(favouriteQuote.indexOf("better"));
        System.out.println(favouriteQuote.lastIndexOf("better"));
        System.out.println(favouriteQuote.replace("better", "worse"));
        System.out.println(favouriteQuote.substring(0, 10));
        System.out.println(favouriteQuote.trim());
        System.out.println(favouriteQuote.isEmpty());
        System.out.println(favouriteQuote.isBlank());
        System.out.println(favouriteQuote.length());
        System.out.println(favouriteQuote.equals("Do the best you can until you know better. Then when you know better, do better."));
        System.out.println(favouriteQuote.equalsIgnoreCase("do the best you can until you know better. then when you know better, do better."));
    }
}
