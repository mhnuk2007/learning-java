package ControlStructures;
// Grouping multiple cases
public class SwitchExample7 {
    public static void main(String[] args) {
        int month = 12;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Other season");
        }
    }
}
// Output: Winter
