package ControlStructures;
// default in the middle
public class SwitchExample4 {
    public static void main(String[] args) {
        int x = 9;

        switch (x) {
            case 1: System.out.println("One"); break;
            default: System.out.println("Default case"); break;
            case 2: System.out.println("Two"); break;
        }
    }
}
// Output: Default case
