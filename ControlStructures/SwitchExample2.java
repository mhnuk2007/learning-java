package ControlStructures;
// switch with String
public class SwitchExample2 {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch (fruit) {
            case "Apple": System.out.println("Red fruit"); break;
            case "Banana": System.out.println("Yellow fruit"); break;
            default: System.out.println("Unknown fruit");
        }
    }
}
// Output: Red fruit
