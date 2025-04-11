package ControlStructures;
// switch without break (fall-through)
public class SwitchExample3 {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1: System.out.println("One");
            case 2: System.out.println("Two");
            case 3: System.out.println("Three");
        }
    }
}
// Output:
// Two
// Three
