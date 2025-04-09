public class OperatorsPractice {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5, result;
        result = a + b;
        System.out.println("Addition: " + result);   // 10 + 5 = 15

        result = a - b;
        System.out.println("Subtraction: " + result); // 10 - 5 = 5

        result = a * b;
        System.out.println("Multiplication: " + result); // 10 * 5 = 50

        result = a / b;
        System.out.println("Division: " + result);   // 10 / 5 = 2

        result = a % b;
        System.out.println("Modulus (remainder): " + result); // 10 % 5 = 0

        // Relational Operators
        System.out.println("Is a > b? " + (a > b));   // true
        System.out.println("Is a < b? " + (a < b));   // false
        System.out.println("Is a == b? " + (a == b)); // false
        System.out.println("Is a != b? " + (a != b)); // true

        // Logical Operators
        boolean condition1 = a > 5;
        boolean condition2 = b < 10;

        System.out.println("Logical AND (a > 5 && b < 10): " + (condition1 && condition2)); // true
        System.out.println("Logical OR (a > 5 || b > 10): " + (condition1 || (b > 10)));    // true
        System.out.println("Logical NOT !(a < b): " + !(a < b));  // true

        // Assignment Operators
        int c = 20;
        c += 5;  // c = c + 5
        System.out.println("c after +=: " + c);  // 25

        c -= 5;  // c = c - 5
        System.out.println("c after -=: " + c);  // 20

        c *= 2;  // c = c * 2
        System.out.println("c after *=: " + c);  // 40

        c /= 4;  // c = c / 4
        System.out.println("c after /=: " + c);  // 10

        c %= 3;  // c = c % 3
        System.out.println("c after %=: " + c);  // 1

        // Unary Operators
        int d = 10;
        System.out.println("Pre-increment: " + ++d); // 11
        System.out.println("Post-increment: " + d++); // 11 (prints then increments)
        System.out.println("Value of d after post-increment: " + d); // 12

        int e = 5;
        System.out.println("Pre-decrement: " + --e); // 4
        System.out.println("Post-decrement: " + e--); // 4 (prints then decrements)
        System.out.println("Value of e after post-decrement: " + e); // 3
    }
}
